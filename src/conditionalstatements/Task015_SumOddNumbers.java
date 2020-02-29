package conditionalstatements;

import java.util.Scanner;

public class Task015_SumOddNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int a = input.nextInt();
        int sum = 0;
        int temp = a;
        int counter = 1;
        
        System.out.println("The odd numbers are: ");
        
        for (int i = 1; counter <= temp; i++) {
            if (i % 2 != 0) {
                sum += i;
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("The sum of odd numbers upto " + a + " terms is: " + sum);
    }
}
