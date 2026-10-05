package Controller;

import Algorithms.IRateLimiter;
import CommonEnums.RateLimiterType;
import Factory.RateLimiterFactory;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

public class RateLimiterController {
    private final IRateLimiter rateLimiter;
    private final ExecutorService executor;

    public RateLimiterController(RateLimiterType rateLimiterType, Map<String,Object>config,ExecutorService executor){
        this.rateLimiter= RateLimiterFactory.createRateLimiter(rateLimiterType,config);
        this.executor=executor;
    }

    public CompletableFuture<Boolean> processRequest(String rateLimiterKey){
        return CompletableFuture.supplyAsync(()->{
            boolean allowed=rateLimiter.giveAccess(rateLimiterKey);
            if(allowed){
                System.out.printf("Request with key [%s]: ✅ Allowed%n", rateLimiterKey);
            }else{
                System.out.printf("Request with key [%s]: ❌ Blocked%n", rateLimiterKey);
            }
            return allowed;
        },executor);
    }
    public void updateConfiguration(Map<String,Object>config){
        rateLimiter.updateConfiguration(config);
    }
    public void shutDown(){
        rateLimiter.shutDown();
        executor.shutdownNow();
    }
}
