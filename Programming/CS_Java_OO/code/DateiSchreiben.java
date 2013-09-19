
import java.io.FileWriter;
import java.io.IOException;

public class DateiSchreiben {

  public static void main(String[] args) {

    FileWriter fw = null;
    try {
      fw = new FileWriter("/Users/kaspar/Desktop/datei.txt");

      fw.write("bla");

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fw != null) {
          fw.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
