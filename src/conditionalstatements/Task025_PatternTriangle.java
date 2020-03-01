package conditionalstatements;

import java.util.Scanner;

public class Task025_PatternTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        int counter = 1;
        int spaces = rows - 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            int temp = i;
            for (int k = 0; k < counter; k++) { 
                if (k < counter / 2) {
                    System.out.print(temp--);
                } else {
                    System.out.print(temp++);
                }
            }
            counter = (i + 1) * 2 - 1;
            System.out.println("");
        }
    }
}
