package conditionalstatements;

import java.util.Scanner;

public class Task014_MutliplicationTable {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of terms for the table: ");
        int terms = input.nextInt();
        
        for (int i = 0; i <= terms; i++) {
            System.out.println(terms + " X " + i + " = " + (terms * i));
        }
    }
}
