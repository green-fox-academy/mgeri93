import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

        System.out.println("Please insert your numbers:");
        Scanner scanner = new Scanner(System.in);
        int userInput1 =  scanner.nextInt();
        int userInput2 =  scanner.nextInt();
        int userInput3 =  scanner.nextInt();
        int userInput4 =  scanner.nextInt();
        int userInput5 =  scanner.nextInt();


        int sum = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5);
        double avg = ((userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5d);

        System.out.println("The sum of the numbers is: " + (sum) + " , and their average is: " + (avg) );
    }
}
