package conditionalstatements;

import java.util.Scanner;

public class Task031_IncreaseDecrease {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int a = input.nextInt();
        System.out.print("Input 2nd number: ");
        int b = input.nextInt();
        System.out.print("Input 3rd number: ");
        int c = input.nextInt();
        
        System.out.println(checkNumbers(a, b, c));
    }
    
    public static String checkNumbers(int a, int b, int c) {
        if (a < b && b < c) {
            return "Increasing order";
        } else if (a > b && b > c) {
            return "Deacresing order";
        } else {
            return "Neither increasing or decreasing order";
        }
    }
}
