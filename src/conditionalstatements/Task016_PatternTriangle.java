package conditionalstatements;

import java.util.Scanner;

public class Task016_PatternTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        int counter = rows;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
