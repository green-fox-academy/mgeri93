import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        System.out.println("How many chickens does the farmer have?");
        Scanner scanner1 = new Scanner(System.in);
        int userInput1 =  scanner1.nextInt();

        System.out.println("How many pigs does the farmer have?");
        Scanner scanner2 = new Scanner(System.in);
        int userInput2 =  scanner1.nextInt();

        int allLegs = ((userInput1 * 2) + (userInput2 * 4));

        System.out.println(("The animals have ") + (allLegs) + (" legs in total."));

    }
}
