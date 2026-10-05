import CommonEnums.RateLimiterType;
import Controller.RateLimiterController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        demonstrateRateLimiting();
    }

    private static void demonstrateRateLimiting(){
        Map<String,Object> config=new HashMap<>();
        config.put("capacity",5);
        config.put("refreshRate",1);
        ExecutorService executor= Executors.newFixedThreadPool(10);
        RateLimiterController controller=new RateLimiterController(RateLimiterType.TOKEN_BUCKET,config,executor);
        System.out.println("=== EXAMPLE 1: Global rate limiting – Burst of requests ===");
        sendBurstRequest(controller, 10, null);
        // --- Example 2: Global rate limiting – After waiting for tokens refill ---
        System.out.println("\n=== EXAMPLE 2: Global rate limiting – After waiting for tokens refill ===");
        System.out.println("Waiting 5 seconds for tokens to refill...");
        sleep(5000);
        sendBurstRequest(controller, 10, null);
        String[] users = {"user1", "user2", "user3"};
        for (String user : users) {
            System.out.println("\nRequests for " + user + ":");
            sendBurstRequest(controller, 7, user);
        }

        System.out.println("\n=== EXAMPLE 4: High concurrency scenario ===");
        List<CompletableFuture<Boolean>> futures = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            futures.add(controller.processRequest(null));
        }
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
        long allowed = futures.stream().filter(CompletableFuture::join).count();
        System.out.printf("High concurrency results: %d allowed, %d blocked%n", allowed, 20 - allowed);

        controller.shutDown();
    }

    public static void sendBurstRequest(RateLimiterController controller,int count,String rateLimitKey){
        List<CompletableFuture<Boolean>>futures=new ArrayList<>();
        for(int i=1;i<=count;i++){
            futures.add(controller.processRequest(rateLimitKey));
        }
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
        long allowed = futures.stream().filter(CompletableFuture::join).count(); // Joins each future to get its boolean result.
        System.out.printf("Results: %d allowed, %d blocked (total: %d)%n", allowed, count - allowed, count);
    }
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
