package conditionalstatements;

import java.util.Scanner;

public class Task005_Weekday {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int day = input.nextInt();
        String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        while (day < 1 || day > 7) {
            System.out.print("Number is not between 1 and 7. Input another: ");
            day = input.nextInt();
        } 
        
        System.out.println(weekday[day - 1]);
    }
}
