package conditionalstatements;

import java.util.Scanner;

public class Task009_IsLeapYear {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = input.nextInt();
        boolean leap;
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                 leap = (year % 400 == 0);
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        
        if (leap == true) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
