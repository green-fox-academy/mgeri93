import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

// Write a program that asks for two numbers and prints the bigger one

        System.out.println("Please insert your first number");
        Scanner scanner1 = new Scanner(System.in);
        int userInput1 =  scanner1.nextInt();

        System.out.println("Please insert your second number");
        Scanner scanner2 = new Scanner(System.in);
        int userInput2 =  scanner2.nextInt();

        if (userInput1 > userInput2) {
            System.out.println((userInput1) + (" is the bigger."));
        } else if (userInput2 > userInput1) {
            System.out.println((userInput2) + (" is the bigger."));
        } else {
                System.out.println("They are equal.");
            }
        }
    }

