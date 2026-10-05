package CallableExample;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Main {

    public static void main(String[] args) throws Exception {
        // Create Callable task
        Callable<Integer> task = () -> {
            System.out.println("Calculating...");
            return 10 + 20;
        };
        // Create thread manager
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Submit task
        Future<Integer> future = executor.submit(task);
        // Get result
        Integer result = future.get();
        System.out.println("Result: " + result);
        // Stop executor
        executor.shutdown();
    }
}
