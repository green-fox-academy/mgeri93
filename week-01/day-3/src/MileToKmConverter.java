import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        double kmToMile = 0.621371192;

        System.out.println("Please enter a distance in kilometers:");
        Scanner scanner = new Scanner(System.in);
        int userInput =  scanner.nextInt();

        System.out.println(userInput * kmToMile);

            // The title is misleading, it should be KmToMileConverter





    }
}
