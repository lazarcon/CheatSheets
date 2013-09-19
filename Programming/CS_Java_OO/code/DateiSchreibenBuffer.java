
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DateiSchreibenBuffer {

  public static void main(String[] args) {
    String path = "/Users/kaspar/Desktop/datei.txt";
    
    BufferedWriter buffer = null;
    try {
      long start = System.currentTimeMillis();

      buffer =
          new BufferedWriter(new FileWriter(new File(path)));
      for (int i = 0; i < 100; i++) {
        buffer.write("bla");
      }
      buffer.write(System.getProperty("line.separator") + " Ende");

      long stop = System.currentTimeMillis();
      System.out.println("Zeit: " + (stop - start) + " millisekunden");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (buffer != null) {
          buffer.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

}