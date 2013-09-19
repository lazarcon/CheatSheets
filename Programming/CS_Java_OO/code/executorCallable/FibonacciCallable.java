
import java.util.concurrent.Callable;

public class FibonacciCallable  implements Callable<Integer>{

  private Integer stellen;
  
  public FibonacciCallable(Integer stellen) {
    this.stellen = stellen;
  }

  public static int fibonacciRekursiv(Integer aInt) {

    int n = aInt.intValue();
    
    int res = 0;

    if (n >= 2) {
      res = fibonacciRekursiv(n - 1) + fibonacciRekursiv(n - 2);
    } else if (n == 1) {
      res = 1;
    }
    return res;
  }

  @Override
  public Integer call() throws Exception {
    System.out.println(Thread.currentThread().getName() + " startet berechnung der Fibonacci Zahl fuer n = '" + stellen + "'");
    long start = System.currentTimeMillis();
    
    int fibonacciZahl = fibonacciRekursiv(Integer.valueOf(stellen)); 
    
    System.out.println(Thread.currentThread().getName() + " hat Fibonacci Zahl fuer n = '" + stellen + "' berechnet: " + (System.currentTimeMillis() - start) + " ms");
    return fibonacciZahl;
  }

}
