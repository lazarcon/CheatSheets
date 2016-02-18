
public class Waiter implements Runnable {
  
  private Object monitor;

  public Waiter(Object monitor) {
    this.monitor = monitor;
  }

  @Override
  public void run() {
    while (true) {
      
      synchronized (monitor) {
        System.out.println(Thread.currentThread().getName() 
            + ": Warten bis notify vom Notifier aufgerufen wird...");
        try {
          monitor.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()  + ": ...weiter...");
      }
    }
  }
}
