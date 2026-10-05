package Algorithms;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TokenBucketStrategy implements IRateLimiter {
    private final int bucketCapacity;
    private volatile int refreshRate;

    private final Bucket globalBucket;
    private final ConcurrentHashMap<String,Bucket>userBucket;

    private final ScheduledExecutorService scheduler;
    private final long refillIntervals;

    @Override
    public boolean giveAccess(String rateLimitKey) {
        if(rateLimitKey!=null&&!rateLimitKey.isEmpty()){
            Bucket bucket=userBucket.computeIfAbsent(rateLimitKey,key->new Bucket(bucketCapacity));
            return bucket.tryConsume();
        }else{
            return globalBucket.tryConsume();
        }
    }

    @Override
    public void updateConfiguration(Map<String, Object> config) {
        if(config.containsKey("refreshRate")){
            this.refreshRate=(int) config.get("refreshRate");
        }
    }

    @Override
    public void shutDown() {
        scheduler.shutdownNow();
    }

    private class Bucket{
        private int token;
        private final ReentrantLock lock=new ReentrantLock();

        public Bucket(int initialTokens){
            this.token=initialTokens;
        }

        public boolean tryConsume(){
            lock.lock();
            try{
                if(token>0){
                    token=token-1;
                    return true;
                }
                return false;
            }finally {
                lock.unlock();
            }
        }

        public void refill(){
            lock.lock();
            try{
                token=Math.min(bucketCapacity,token+refreshRate);
            }finally {
                lock.unlock();
            }
        }
    }

    public TokenBucketStrategy(int bucketCapacity,int refreshRate){
        this.bucketCapacity=bucketCapacity;
        this.refreshRate=refreshRate;
        this.globalBucket=new Bucket(bucketCapacity);
        userBucket=new ConcurrentHashMap<>();
        scheduler= Executors.newSingleThreadScheduledExecutor();
        this.refillIntervals=1000;
        startRefillTask();
    }
    private void startRefillTask(){
        scheduler.scheduleAtFixedRate(()->{
            globalBucket.refill();
            for(Bucket bucket:userBucket.values()){
                    bucket.refill();
            }
        },refillIntervals,refillIntervals, TimeUnit.MILLISECONDS);
    }

}
