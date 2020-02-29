package conditionalstatements;

import java.util.Scanner;

public class Task006_FloatCompare {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a floating point number: ");
        float one = input.nextFloat();
        System.out.print("Input another floating point number: ");
        float two = input.nextFloat();
        
        double oneUp = Math.round(one);
        double twoUp = Math.round(two);
        
        if (oneUp == twoUp) {
            System.out.println("They are the same up to three decimal spaces");
        } else {
            System.out.println("They are different");
        }
    }
}
