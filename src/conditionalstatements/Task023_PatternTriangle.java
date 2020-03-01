package conditionalstatements;

import java.util.Scanner;

public class Task023_PatternTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        int counter = 0;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(" ");
            }
            for (int k = rows - counter; k != 0; k--) {
                System.out.print("*");
            }
            counter++;
            System.out.println("");
        }
    }
}
