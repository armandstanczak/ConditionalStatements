package conditionalstatements;

import java.util.Scanner;

public class Task001_PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        
        if (number > 0) {
            System.out.println("Number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
