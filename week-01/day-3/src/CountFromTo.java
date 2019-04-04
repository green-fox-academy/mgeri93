import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

        System.out.println("First number:");
        Scanner scanner1 = new Scanner(System.in);
        int userInput1=  scanner1.nextInt();

        System.out.println("Second number:");
        Scanner scanner2 = new Scanner(System.in);
        int userInput2 =  scanner2.nextInt();

        if (userInput2 <= userInput1) {
            System.out.println("The second number should be bigger");
        } else {
                while (userInput1 < userInput2) {
                    System.out.println(userInput1);
                    userInput1++;
                }
            }
        }


    }

