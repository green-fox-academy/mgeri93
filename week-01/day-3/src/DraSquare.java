import java.util.Scanner;

public class DraSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was

        System.out.println("Please insert your number");
        Scanner scanner = new Scanner(System.in);
        int userInput =  scanner.nextInt();

        for (int i = 0; i < userInput; i++) {

            for (int j = 0; j < userInput; j++) {

                if (i == 0 || j == 0
                        || i == userInput - 1 || j == userInput - 1
                        || i == userInput- 1)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
