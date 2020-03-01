package conditionalstatements;

import java.util.Scanner;

public class Task021_PatternDoubleTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        int temp = rows;
        int additionalRows = rows - 1;
        int countEmpy = 2; 
        
        for (int i = 1; i <= rows; i++) {
            for (int k = temp; k != 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            temp--;
            System.out.print("\n");
        }
        
        for (int x = 1; x <= additionalRows; x++) {
            for (int y = 1; y <= countEmpy; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= additionalRows - x + 1; z++) {
                System.out.print("* ");
            }
            countEmpy++;
            System.out.print("\n");
        }
    }
}
