package conditionalstatements;

import java.util.Scanner;

public class Task002_QuadraticEquations {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = input.nextInt();
        System.out.print("Input b: ");
        int b = input.nextInt();
        System.out.print("Input c: ");
        int c = input.nextInt();
        
        switch (isQuadraticQ(a, b, c)) {
            case 1:
                System.out.println("The roots are " + rootA(a, b, c) + " and " + rootB(a, b, c));
                break;
            case -1:
                System.out.println("Theequations has no real roots");
                break;
            case 0:
                System.out.println("The root is " + rootZero(a, b, c));
                break;
            default:
                break;
        }
    }
    
    public static double rootA(int a, int b, int c) {
        return (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;
    }
    
    public static double rootB(int a, int b, int c) {
        return (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;
    }
    
    public static double rootZero(int a, int b, int c) {
        return -b / (2 * a);
    }
    
    public static int isQuadraticQ(int a, int b, int c) {
        
        double res = b * b - 4 * a * c;
        
        if (res > 0) {
            return 1;
        } else if( res < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
