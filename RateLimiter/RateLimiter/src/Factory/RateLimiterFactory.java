package Factory;

import Algorithms.IRateLimiter;
import Algorithms.TokenBucketStrategy;
import CommonEnums.RateLimiterType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class RateLimiterFactory {
    private static final Map<RateLimiterType, Function<Map<String,Object>, IRateLimiter>>limiterFactories=new HashMap<>();
    static {
        limiterFactories.put(RateLimiterType.TOKEN_BUCKET,config->{
            int capacity=(int)config.getOrDefault("capacity",10);
            int refreshRate;
            if(config.containsKey("refreshRate")){
                refreshRate=(int)config.get("refreshRate");
            }else{
                double tokenPerSecond=(double)config.getOrDefault("tokenPerSecond",10.0);
                refreshRate=(int)Math.round(tokenPerSecond);
            }
            return new TokenBucketStrategy(capacity,refreshRate);
        });
        // Additional strategies (FIXED_WINDOW, SLIDING_WINDOW, LEAKY_BUCKET, etc.) can be registered here.
    }

    public static IRateLimiter createRateLimiter(RateLimiterType rateLimiterType,Map<String,Object>config){
        Function<Map<String,Object>,IRateLimiter>factory=limiterFactories.get(rateLimiterType);
        if(factory==null){
            throw new IllegalArgumentException("Unsipported Rate Limter Type: "+rateLimiterType);
        }
        return factory.apply(config);
    }

    public static void registerRateLimiterFactory(RateLimiterType type,Function<Map<String,Object>,IRateLimiter>factory){
        limiterFactories.put(type,factory);
    }
}
