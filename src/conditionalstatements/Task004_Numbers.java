package conditionalstatements;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task004_Numbers {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        BigDecimal number = input.nextBigDecimal();
        
        System.out.println("Number is " + posNeg(number) + smallBig(number));
    }
    
    public static String posNeg(BigDecimal a) {
        BigDecimal temp = new BigDecimal(0);
        if (a.compareTo(temp) > 0){
            return "positive";
        } else if (a.compareTo(temp) < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
        
    public static String smallBig(BigDecimal a) {
        BigDecimal temp = new BigDecimal(1000);
        if (a.compareTo(temp) >= 0) {
            return " and large";
        } else {
            return " and small";
        }
    }
}
