
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DateiLesenBuffer {

  public static void main(String[] args) {
    BufferedReader reader = null;
    try {
      File file = new File("/home/kaspar/Desktop/file.txt");
      reader = new BufferedReader(new FileReader(file));

      String zeile = reader.readLine();
      while (zeile != null) {
        System.out.println(zeile);
        zeile = reader.readLine();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
