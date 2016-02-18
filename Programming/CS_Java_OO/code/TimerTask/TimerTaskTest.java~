
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TimerTaskTest {
  
  public static void main( String[] args )
  {
    Timer timer = new Timer();

    // Start in 2 Sekunden
    System.out.println("Start: " + new Date());
    timer.schedule( new Task("Task 1"), 2000 );

    // Start in einer Sekunde dann Ablauf alle 5 Sekunden
    timer.schedule( new Task("Task 2"), 1000, 5000 );
    
    
    Calendar c = Calendar.getInstance();
    c.add(Calendar.SECOND, 15);
    Date d = c.getTime();
    System.out.println("Task 3 startet am: " + d);
    // Start genau am:
    timer.schedule(new Task("Task 3 ------------"), d);
  }

}
