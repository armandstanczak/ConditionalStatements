package conditionalstatements;

import java.util.Scanner;

public class Task022_PascalTriangle {

    public static void main(String[] args) {
        
        int counter = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        
        for (int i = 0; i < rows; i++) { 
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || i == 0) {
                    counter = 1;
                } else {
                    counter = counter * (i - k + 1) / k;
                }
                System.out.print(" " + counter);
            }
            System.out.println(" ");
        }
    }
}
