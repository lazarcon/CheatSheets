
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DateiSchreibenOhneBuffer {

  public static void main(String[] args) {
    
  String path = "/Users/kaspar/Desktop/datei.txt";
  
    FileWriter writer = null;
    try {
      long start = System.currentTimeMillis();

      writer = new FileWriter(new File(path));
      for (int i = 0; i < 100; i++) {
        writer.write("bla");
      }
      writer.write(System.getProperty("line.separator") + " Ende");

      long stop = System.currentTimeMillis();
      System.out.println("Zeit: " + (stop - start) + " millisekunden");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (writer != null) {
          writer.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

}