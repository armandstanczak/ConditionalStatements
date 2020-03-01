package conditionalstatements;

import java.util.Scanner;

public class Task029_DigitCount {

    public static void main(String[] args) {
        
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        long number = input.nextLong();
        
        while (number < 1) {
            System.out.print("The number is not positive, input another: ");
            number = input.nextLong();
        }
        
        while (number > 100000000000L) {
            System.out.print("The number is to big, input another: ");
            number = input.nextLong();
        }
        
        while (number != 0) {
            number /= 10;
            counter++;
        }
        
        System.out.println("Number of digits in the number is: " + counter);
    }
}
