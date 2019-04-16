import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class TelephoneBook {
  public static void main(String[] ags){
    /*Create a map with the following key-value pairs.
Name (key)	Phone number (value)
William A. Lathan	405-709-1865
John K. Miller	402-247-8568
Hortensia E. Foster	606-481-6467
Amanda D. Newland	319-243-5613
Brooke P. Askew	307-687-2982
Create an application which solves the following problems.
What is John K. Miller's phone number?
Whose phone number is 307-687-2982?
Do we know Chris E. Myers' phone number?

     */


    HashMap<String, String> map = new HashMap<String, String>();
    map.put("William A. Lathan", "405-709-1865");
    map.put("John K. Miller", "402-247-8568");
    map.put("Hortensia E.", "606-481-6467");
    map.put("Amanda D. Newland", "319-243-5613");
    map.put("Brooke P. Askew", "307-687-2982");

    System.out.println("John K. Miller's phone number is : " + map.get("John K. Miller"));
    List keys = new ArrayList();
    keys.addAll(map.keySet());
    List values = new ArrayList();
    values.addAll(map.values());
    for ( int i = 0; i < values.size(); i++ ){
      if (values.get(i).equals("307-687-2982")){
        System.out.println("Phone number 307-687-2982 belongs to: " + keys.get(i));
      }
    }



    System.out.println("The phone number 307-687-2982 belongs to " + map.get("307-687-2982") + ".");
    if (map.containsKey("Chris E. Myers")){
      System.out.println("Yes, we know Chris E. Myers' number.");
    } else {
      System.out.println("No, we don't know Chris E. Myers' number.");
    }


  }

}
