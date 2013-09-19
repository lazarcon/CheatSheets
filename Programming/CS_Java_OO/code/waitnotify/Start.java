
public class Start {
  
  
  public static void main(String[] args) {
    
    Object monitor = new Object();
    
    Thread warter = new Thread(new Waiter(monitor));
    warter.setName("Waiter-Thread");
    
    Thread notifizierer = new Thread(new Notifier(monitor));
    notifizierer.setName("Notifier-Thread");
    
    warter.start();
    notifizierer.start();
  }

}
