package conditionalstatements;

import java.util.Scanner;

public class Task007_DaysInMonth {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month = input.nextInt();
        System.out.print("Input a year: ");
        int year = input.nextInt();
        
        while (month < 1 || month > 12) {
            System.out.println("Number representing a month is wrong, input another one between 1 and 12: ");
            month = input.nextInt();
        }
        
        System.out.println(monthName(month) + " " + year + " has " + monthDays(month, year, leap(year)) + " days");
    }
    
    public static boolean leap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
    public static String monthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", " June", "July", "August", "Pctober", "November", "December"};
        return months[month - 1];
    }
    
    public static int monthDays(int month, int year, boolean b) {
        switch (month) {
            case 1:
                return 31;
            case 2:
                if (leap(year) == true) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 30;
            case 9:
                return 31;
            case 10:
                return 30;
            case 11:
                return 31;
            case 12:
                return 30;
            default:
                return 1;
        }
    }
    
}
