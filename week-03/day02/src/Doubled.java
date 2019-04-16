import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    deDuplicate("duplicated-chars.txt");

  }

  public static void deDuplicate(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> content = Files.readAllLines(filePath);
      String data = content.toString();
      String s = "";
      for (int i = 0; i < data.length(); i += 2) {
      s+= String.valueOf(data.charAt(i));
      }
      System.out.println(s);
    }
    catch(IOException e){
      System.out.println("Cannot read file.");
    }
  }
}