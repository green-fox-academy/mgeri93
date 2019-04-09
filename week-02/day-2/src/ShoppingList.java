import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
  public static void main(String[] args){
    /* We are going to represent a shopping list in a list containing strings.

Create a list with the following items.
Eggs, milk, fish, apples, bread and chicken
Create an application which solves the following problems.
Do we have milk on the list?
Do we have bananas on the list?

     */
    List shoppingList = new ArrayList();
    shoppingList.add("Eggs");
    shoppingList.add("Milk");
    shoppingList.add("Fish");
    shoppingList.add("Apples");
    shoppingList.add("Bread");
    shoppingList.add("Chicken");

    if (shoppingList.contains("Milk")){
      System.out.println("Yes, we have milk on the list.");
    } else {
      System.out.println("No, we don't have milk on the list.");
    }
    if (shoppingList.contains("Bananas")){
      System.out.println("Yes, we have bananas on the list.");
    } else {
      System.out.println("No, we don't have bananas on the list.");
    }


  }
}
