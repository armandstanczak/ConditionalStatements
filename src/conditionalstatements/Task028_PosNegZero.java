package conditionalstatements;

import java.util.Scanner;

public class Task028_PosNegZero {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        float number = input.nextFloat();
        
        System.out.println(checkNumber(number));
    }
    
    public static String checkNumber(float a) {
        if (a == 0) {
            return "zero";
        } else if (a > 0) {
            if (a > 1000000) {
                return "positive large";
            } else {
                return "positive small";
            }
        } else {
            if (Math.abs(a) > 1000000) {
                return "negative large";
            } else {
                return "negative small";
            }
        }
    }
}
