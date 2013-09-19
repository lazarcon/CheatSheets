
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Beispiel1 {

  public static void main(String[] args) {
    
    ExecutorService executorService =
      Executors.newCachedThreadPool();
    
    Future<Integer> result = executorService.submit(
        new FibonacciCallable(40));
    
    System.out.println("Rechnen");
    // Hier noch andere Sachen tun
    System.out.println("Waehrend parallel gerechnet wird...");
    
    try {
      // Das resultat abholen
      Integer res = result.get();
      
      System.out.println(res);
      
      executorService.shutdown();
      
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
