import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet() {
    this.sharpies = new ArrayList<>();
  }

  public void add(Sharpie sharpie) {
    sharpies.add(sharpie);
  }

  public int countUsable() {
    int i = 0;
    for (Sharpie sharpie : this.sharpies) {
      if (sharpie.inkAmount > 0) {
        i++;
      }
    }
    return i;
  }

  public List removeTrash(){
    int i = 0;
    for (Sharpie sharpie : this.sharpies) {
      if (sharpie.inkAmount > 0) {
        i++;
      } else {
        sharpies.remove(i);
      }
    }
    return sharpies;
  }

}

