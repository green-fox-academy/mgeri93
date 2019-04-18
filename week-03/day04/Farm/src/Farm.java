import java.lang.reflect.Array;
import java.util.List;

public class Farm {
  List<Animal> animals;
  int slots = 10;


  void breed() {
   if( animals.size() < slots){
     Animal animal = new Animal();
     animals.add(animal);
   }
    }

    public void slaghter() {
      int minHunger = 10000;
      int minIndex = 0;
      for (int i = 0; i < animals.size(); i++){
        if (animals.get(i).getHunger() < minHunger){
          minHunger = animals.get(i).getHunger();
          minIndex = i;
        }
      }
      animals.remove(minIndex);
        }

  }


