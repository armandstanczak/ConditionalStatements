package conditionalstatements;

import java.util.Scanner;

public class Task003_MaxNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int a = input.nextInt();
        System.out.print("Input the 2nd number: ");
        int b = input.nextInt();
        System.out.print("Input the 3rd number: ");
        int c = input.nextInt();

        System.out.println("The greatest: " + maxNumber(a, b, c));
    }
   
    public static int maxNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
