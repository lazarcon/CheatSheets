
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Beispiel2 {

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newCachedThreadPool();
    
    Collection<Callable<Integer>> tasks =
      new ArrayList<Callable<Integer>>();
    
    tasks.add(new FibonacciCallable(45));
    tasks.add(new FibonacciCallable(35));
    tasks.add(new FibonacciCallable(45));
    tasks.add(new FibonacciCallable(40));
    
    List<Future<Integer>> result = null;
    try {
      long start = System.currentTimeMillis();
      result = executorService.invokeAll(tasks);
      System.out.println("Total Time: " + (System.currentTimeMillis() - start));
    } catch (InterruptedException e1) {
      e1.printStackTrace();
    }
    
    System.out.println("Rechnen");

    for (Future<Integer> future : result) {
      try {
        System.out.println(future.get());
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (ExecutionException e) {
        e.printStackTrace();
      }
    }
    executorService.shutdown();
  }
}
