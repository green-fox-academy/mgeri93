import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

        int storedNumber = 44;
        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.println("Guess the number:");
            guess = scanner.nextInt();

            if (guess == storedNumber) {
                System.out.println("You found the number: " + storedNumber);
            } else if (guess < storedNumber) {
                System.out.println("The stored number is higher");
            } else if (guess > storedNumber) {
                System.out.println("The stored number is lower");
            }
        }while (guess != storedNumber) ;



    }
}
