import java.util.HashMap;

public class AnotherShoppingList {
  public static void main(String[] args){
    HashMap<String, Double> priceList = new HashMap<>();
      priceList.put("Milk", 1.07);
      priceList.put("Rice", 1.59);
      priceList.put("Eggs", 3.14);
      priceList.put("Cheese", 12.60);
      priceList.put("Chicken Breasts", 9.40);
      priceList.put("Apples", 2.31);
      priceList.put("Tomato", 2.58);
      priceList.put("Potato", 1.75);
      priceList.put("Onion",1.10);


    HashMap<String, Integer> bob = new HashMap<>();
      bob.put("Milk", 3);
      bob.put("Rice", 2);
      bob.put("Eggs", 2);
      bob.put("Cheese", 1);
      bob.put("Chicken Breasts", 4);
      bob.put("Apples", 1);
      bob.put("Tomato", 2);
      bob.put("Potato", 1);

    HashMap<String, Integer> alice = new HashMap<>();
      alice.put("Rice", 1);
      alice.put("Eggs", 5);
      alice.put("Chicken Breasts", 2);
      alice.put("Apples", 1);
      alice.put("Tomato", 10);

    /*How much does Bob pay?
How much does Alice pay?
Who buys more Rice?
Who buys more Potato?
Who buys more different products? check
Who buys more products? (piece)

     */

    if (bob.size()> alice.size()){
      System.out.println("Bob buys more different products.");
    } else if (bob.size()< alice.size()){
      System.out.println("Alice buys more different products.");
    } else {
      System.out.println("They buy the same variety of products.");
    }


  }
}
