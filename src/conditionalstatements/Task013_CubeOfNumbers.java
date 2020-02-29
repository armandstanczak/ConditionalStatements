package conditionalstatements;

import java.util.Scanner;

public class Task013_CubeOfNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int a = input.nextInt();
        
        for (int i = 1; i <= a; i++) {
            System.out.println("Number is : " + i + " and cube if " + i + " is : " + (int)Math.pow(i, 3));
        }
    }
}
