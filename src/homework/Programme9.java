package homework;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */

public class Programme9 {
    public static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        System.out.println("Enter Your Name");
        String a = obj.nextLine();
        System.out.println("Your Name Convert into lower case: " +a.toLowerCase());
    }
}
