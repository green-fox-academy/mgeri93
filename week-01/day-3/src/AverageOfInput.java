import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

        System.out.println("Please insert the first number");
        Scanner scanner1 = new Scanner(System.in);
        int userInput1 =  scanner1.nextInt();

        System.out.println("Please insert the second number");
        Scanner scanner2 = new Scanner(System.in);
        int userInput2 =  scanner2.nextInt();

        System.out.println("Please insert the third number");
        Scanner scanner3 = new Scanner(System.in);
        int userInput3 =  scanner3.nextInt();

        System.out.println("Please insert the fourth number");
        Scanner scanner4 = new Scanner(System.in);
        int userInput4 =  scanner4.nextInt();

        System.out.println("Please insert the fifth number");
        Scanner scanner5 = new Scanner(System.in);
        int userInput5 =  scanner5.nextInt();

        int sum = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5);
        int avg = ((userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5);

        System.out.println(("The sum of the numbers is: ") + (sum) + (", and their average is: ") + (avg) + ("."));



    }
}
