import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
        // NOT YET FINISHED!!!!!!!!!!!!!!!!!!!

        System.out.println("Please insert your number");
        Scanner scanner = new Scanner(System.in);
        int userInput =  scanner.nextInt();

        for (int i=1; (i / 2)<(userInput); i += 2)
        {
            for (int k=0; k < (userInput - i / 2 ); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
