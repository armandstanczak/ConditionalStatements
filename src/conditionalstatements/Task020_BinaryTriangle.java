package conditionalstatements;

import java.util.Scanner;

public class Task020_BinaryTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        int counter;
        
        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) {
                counter = 0;
            } else {
                counter = 1;
            }
            for (int j = 1; j <= i; j++) {
                if (counter == 1) {
                    System.out.print(1);
                    counter--;
                } else {
                    System.out.print(0);
                    counter++;
                }
            }
            System.out.println("");
        }
    }
}
