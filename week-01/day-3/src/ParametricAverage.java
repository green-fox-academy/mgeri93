import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

        int i,numberOfIntegers, sum = 0;
        double avg;
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        numberOfIntegers=userInput.nextInt();

        int a[ ] = new int[numberOfIntegers];
        for(i=0;i<numberOfIntegers;i++)
        {
            System.out.println("Please enter value of array");
            a[i]=userInput.nextInt();
            sum = sum + a[i];

        }
        avg = (double)sum / numberOfIntegers;
        System.out.printf("Sum: " + sum + ", Average: " + avg);









    }
}
