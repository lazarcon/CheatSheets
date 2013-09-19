
public class TestReentrantLockTryLockMain {
  
  public static void main(String[] args) {
    TestReentrantLockTryLock job = new TestReentrantLockTryLock();
    
    Thread a = new Thread(job);
    Thread b = new Thread(job);
    a.start();
    b.start();
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Kontostand: " + job.getKontostand());
    System.out.println("Lock bereits vergeben: " + job.getZaehler());
    System.out.println("Summe: " + (job.getKontostand() + job.getZaehler()));
  }

}
