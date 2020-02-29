package conditionalstatements;

import java.util.Scanner;

public class Task008_VowelConsonant {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a character: ");
        String abs = input.next();
        
        if (abs.length() > 1 || !Character.isAlphabetic(abs.charAt(0))) {
            System.err.println("Only letters are allowed");
        } else if (abs.charAt(0) == 'a' || abs.charAt(0) == 'e' || abs.charAt(0) == 'i' || abs.charAt(0) == 'o' || abs.charAt(0) == 'u' || abs.charAt(0) == 'y') {
            System.out.println("Input letter is a Vowel");
        } else {
            System.out.println("Input letter is a Consonant");
        }
    }
}
