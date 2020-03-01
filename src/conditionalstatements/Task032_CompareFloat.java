package conditionalstatements;

import java.util.Scanner;

public class Task032_CompareFloat {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first floating point number: ");
        double a = input.nextDouble();
        System.out.print("Input second floating point number: ");
        double b = input.nextDouble();
        
        if (Math.abs(Math.floor(a * 100) - Math.floor(b * 100)) > 0) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are the same up to 2 decimal places");
        }
    }
}
