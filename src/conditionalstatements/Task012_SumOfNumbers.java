package conditionalstatements;

import java.util.Scanner;

public class Task012_SumOfNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input 5 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int sum = a + b + c + d + e;
        double average = sum / 5;
        
        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average is: " + average);
    }
}
