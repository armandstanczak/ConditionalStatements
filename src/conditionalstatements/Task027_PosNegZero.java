package conditionalstatements;

import java.util.Scanner;

public class Task027_PosNegZero {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double number = input.nextDouble();
        
        System.out.println("The number " + number + " is " + checkNumber(number));
    }
    
    public static String checkNumber(double a) {
        if (a == 0) {
            return "a zero";
        } else if (a > 0) {
            return "positive";
        } else {
            return "negative";
        }
    }
}
