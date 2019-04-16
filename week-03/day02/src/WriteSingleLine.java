import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"
    addName("my-file.txt");

  }

  public static void addName(String filePath) {
    List<String> content = new ArrayList();
      content.add("Geri");
    try {
      Path path = Paths.get(filePath);
      Files.write(path, content);
    } catch (Exception e) {
      System.out.println("Unable to write file: " + filePath);
    }
  }
}