package homework;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme15 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter A and B value");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Before Swapping Number: A = " +a+ " and B = " +b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping Number: A = " +a+ " and B = " +b);
    }
}
