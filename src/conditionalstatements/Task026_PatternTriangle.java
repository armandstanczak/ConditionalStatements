package conditionalstatements;

import java.util.Scanner;

public class Task026_PatternTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = input.nextInt();
        
        int counter = 1;
        int counter2 = rows * 2 - 3;
        int spaces = rows - 1;
        int additionalRows = rows - 1;
        int countEmpy = 1;
        char letter = 'A';
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int k = 0; k < counter; k++) { 
                if (k < counter / 2) {
                    System.out.print(letter++);
                } else {
                    System.out.print(letter--);
                }
            }
            counter = counter + 2;
            System.out.println("");
            letter = 'A';
        }
        
        for (int x = 1; x <= additionalRows; x++) {
            for (int y = 1; y <= countEmpy; y++) {
                System.out.print(" ");
            }
            countEmpy++;
            for (int z = 0; z < counter2; z++) { 
                if (z < counter2 / 2) {
                    System.out.print(letter++);
                } else {
                    System.out.print(letter--);
                }
            }
            counter2 = counter2 - 2;
            System.out.println("");
            letter = 'A';
        }
    }
}
