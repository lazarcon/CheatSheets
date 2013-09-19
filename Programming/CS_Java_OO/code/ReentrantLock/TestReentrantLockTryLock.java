
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLockTryLock implements Runnable {

  private int kontostand;
  private int zaehler;
  private final Lock lock = new ReentrantLock();
  private final Lock lock2 = new ReentrantLock();

  @Override
  public void run() {

    for (int i = 0; i < 50000; i++) {
      inkrementieren();
    }

  }

  private void inkrementieren() {
    // irgendwelcher code
    if (lock.tryLock()) {
      int i = kontostand;
      kontostand = i + 1;
      lock.unlock();
    } else {
      lock2.lock();
      zaehler++;
      lock2.unlock();
    }
    // irgendwelcher code
  }

  public int getKontostand() {
    return kontostand;
  }

  public int getZaehler() {
    return zaehler;
  }
}
