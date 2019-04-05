import java.util.Scanner;

public class DrawDiamond{
    public static void main(String[] args) {
// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

        //Start to decrease after input/2 +1

      /*  System.out.println("Please insert your number");
        Scanner scanner = new Scanner(System.in);
        int userInput =  scanner.nextInt();


        for (int i=1; (i <(userInput + 1)); i += 2) {
            for (int k = 0; k < (userInput - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

            for (i = (userInput / 2 + 1); (i > 0); i += 2) {
                for (int k = 0; k < (userInput - i / 2); k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
*/
        System.out.println("Please insert your number");
        Scanner scanner = new Scanner(System.in);
        int userInput =  scanner.nextInt();

        for (int i = 1; i < userInput + 1; i += 2) {
            for (int j = 0; j < userInput - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }

        for (int i = userInput -2; i > 0; i -= 2) {
            for (int j = 0; j < userInput - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }
/* Ugly with even numbers */

}
}
