package conditionalstatements;

import java.util.Scanner;

public class Task019_PatternTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        int s = rows + 3;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = s; j != 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println("");
            s--;
        }
    }
}
