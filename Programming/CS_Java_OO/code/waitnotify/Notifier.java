
public class Notifier implements Runnable {

  private Object monitor;

  public Notifier(Object monitor) {
    this.monitor = monitor;
  }
  
  @Override
  public void run() {
    while (true) {
      System.out.println(Thread.currentThread().getName()  + ": Schlafe 3 Sekunden...");
      try {
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + ": wache auf...");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      synchronized (monitor) {
        System.out.println(Thread.currentThread().getName() + ": Notifiziere...");
        monitor.notify();
        System.out.println(Thread.currentThread().getName()  + ": habe notifiziert");
      }
      
    }

  }

}
