package conditionalstatements;

import java.util.Scanner;

public class Task011_SumOfNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int a = input.nextInt();
        int sum = 0;
        
        System.out.println("The first " + a + " natural numbers are: ");
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
            sum += i;
        }
        
        System.out.println("The sum od natural numbers upto " + a + " terms is: " + sum);
    }
}
