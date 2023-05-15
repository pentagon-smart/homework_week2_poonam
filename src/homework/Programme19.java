package homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 */
public class Programme19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Input");
        String a = obj.nextLine();
        System.out.println("Output: " +a.toLowerCase());
    }
}
