
public class Station {

  static int gasAmount = 1000;

  public Station() {

  }

  public static void refill() {
    gasAmount -= Car.capacity;
    Car.gasAmount += Car.capacity;
    System.out.println(Car.gasAmount);
    System.out.println(gasAmount);
  }
}