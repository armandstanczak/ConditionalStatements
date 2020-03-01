package conditionalstatements;

import java.util.Scanner;

public class Task025_PatternTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        int counter = 1;
        int counter2 = rows * 2 - 3;
        int spaces = rows - 1;
        int additionalRows = rows - 1;
        int countEmpy = 1;
        int temp;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            temp = i;
            for (int k = 0; k < counter; k++) { 
                if (k < counter / 2) {
                    System.out.print(temp--);
                } else {
                    System.out.print(temp++);
                }
            }
            counter = counter + 2;
            System.out.println("");
        }
        
        for (int x = 1; x <= additionalRows; x++) {
            for (int y = 1; y <= countEmpy; y++) {
                System.out.print(" ");
            }
            countEmpy++;
            temp = rows - x;
            for (int z = 0; z < counter2; z++) { 
                if (z < counter2 / 2) {
                    System.out.print(temp--);
                } else {
                    System.out.print(temp++);
                }
            }
            counter2 = counter2 - 2;
            System.out.println("");
        }
    }
}