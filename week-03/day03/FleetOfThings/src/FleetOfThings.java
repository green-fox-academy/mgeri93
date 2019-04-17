public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing milk = new Thing("Get milk");
    Thing remove = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    Thing lunch = new Thing("Eat lunch");

    fleet.add(milk);
    fleet.add(remove);
    fleet.add(standUp);
    fleet.add(lunch);

    standUp.complete();
    lunch.complete();

    System.out.println(fleet);
  }
}