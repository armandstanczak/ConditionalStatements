package conditionalstatements;

import java.util.Scanner;

public class Task018_PatternTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        int counter = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) { 
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println("");
        }
    }
}
