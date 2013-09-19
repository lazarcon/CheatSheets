
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecStart {
  
  public static void main(String[] args) {
    
    ExecutorService executor = Executors.newCachedThreadPool();
    
    Runnable1 r1 = new Runnable1();
    Runnable2 r2 = new Runnable2();
    
    executor.execute(r1);
    executor.execute(r2);
    
    try {
      Thread.sleep(500);
      System.out.println("Zzzzz...");
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    executor.execute(r1);
    executor.execute(r2);
    
    executor.shutdown();
    
//    executor.isShutdown();
  }

}
