
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock implements Runnable {
  
  private int kontostand;
  private final Lock lock = new ReentrantLock();
  
  @Override
  public void run() {
    
    for (int i = 0; i < 500000; i++) {
      inkrementieren();
    }
    
  }

  private void inkrementieren() {
    // irgendwelcher code
    lock.lock();
    kontostand++;
    lock.unlock();
    // irgendwelcher code
  }

  public int getKontostand() {
    return kontostand;
  }

}
