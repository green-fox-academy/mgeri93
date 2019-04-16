import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args){
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
    copyContent("my-file.txt", "your-file.txt");

  }
  public static void copyContent(String fromFile, String toFile){
    List<String> content = new ArrayList();
    try {
      Path pathFrom = Paths.get(fromFile);
      Path pathTo = Paths.get(toFile);
      List<String> lines = Files.readAllLines(pathFrom);
      for (String s : lines){
        content.add(s);
      }
      Files.write(pathTo, content);
    } catch (IOException e){
      System.out.println("The copy was no successful.");
    }




  }

}
