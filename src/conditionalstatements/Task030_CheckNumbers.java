package conditionalstatements;

import java.util.Scanner;

public class Task030_CheckNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        System.out.println(checkNumbers(a, b, c));
    }
    
    public static String checkNumbers(int a, int b, int c) {
        if (a == b && b == c) {
            return "All numbers are equal";
        } else if (a != b && b != c && a != c) {
            return "All numbers are different";
        } else {
            return "Neither all are equal or different";
        }
    }
}
