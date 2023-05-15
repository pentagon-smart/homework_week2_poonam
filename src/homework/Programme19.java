package homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 */
public class Programme19 {
    public static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        System.out.println("Enter Your Input");
        String a = obj.nextLine();
        System.out.println("Output: " +a.toLowerCase());
    }
}
