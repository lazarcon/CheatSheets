
public class Runnable2 implements Runnable {

  @Override
  public void run() {
    System.out.println(getClass().getName() + " " + Thread.currentThread().getName());

  }

}
