import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ProductDatabase {
  public static void main(String[] args){
    /*
    Create a map with the following key-value pairs.
Product name (key)	Price (value)
Eggs	200
Milk	200
Fish	400
Apples	150
Bread	50
Chicken	550
Create an application which solves the following problems.
How much is the fish?
What is the most expensive product? ---- need to getkey
What is the average price?
How many products' price is below 300?
Is there anything we can buy for exactly 125?
What is the cheapest product?  ----- get key
     */

    HashMap<String, Integer> productDb = new HashMap<>();
    productDb.put("Eggs", 200);
    productDb.put("Milk", 200);
    productDb.put("Fish", 400);
    productDb.put("Apples", 150);
    productDb.put("Bread", 50);
    productDb.put("Chicken", 550);

    System.out.println("The fish costs " + productDb.get("Fish"));

    List keys = new ArrayList();
    keys.addAll(productDb.keySet());
    List<Integer> values = new ArrayList();
    values.addAll(productDb.values());
    int sum = 0;
    for ( int i = 0 ; i < values.size(); i++) {
      sum = sum + values.get(i);
    }
    System.out.println("The average price is: " + (sum /= values.size()));

    Collections.sort(values);
    int below300 = 1;
    for ( int j = 0; values.get(j) < 300 ; j++){
      below300 = j;
    }
    System.out.println("There are " + below300 + " product(s) below 300.");

    if (productDb.containsValue(150)){
      System.out.println("Yes, there are goods we can buy for exactly 125.");
    } else {
      System.out.println("No, there is no product with the price of 125.");
    }
    System.out.println();




  }
}
