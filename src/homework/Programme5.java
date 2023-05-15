package homework;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Programme5 {

    public static Scanner myObj = new Scanner(System.in); //create a Scanner object

    public static void main(String[] args) {
        addition();
        subtraction();
        Programme5 obj = new Programme5();
        obj.multiplication();
        obj.division();

    }

    public static void addition() { //static method
        System.out.println("For Addition");
        System.out.println("Enter first value:");
        int a = myObj.nextInt();
        System.out.println("Enter second value:");
        int b = myObj.nextInt();
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is : " + result);

    }

    public static void subtraction() {
        System.out.println("For Subtraction");
        System.out.println("Enter first value:");
        int a = myObj.nextInt();
        System.out.println("Enter second value:");
        int b = myObj.nextInt();
        int result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is : " + result);
    }

    public void multiplication() { // instance method
        System.out.println("For Multiplication");
        System.out.println("Enter first value:");
        int a = myObj.nextInt();
        System.out.println("Enter second value:");
        int b = myObj.nextInt();
        int result = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is : " + result);
    }

    public void division() {
        System.out.println("For Division");
        System.out.println("Enter first value:");
        int a = myObj.nextInt();
        System.out.println("Enter second value:");
        int b = myObj.nextInt();
        int result = a / b;
        System.out.println("Division of " + a + " and " + b + " is : " + result);
    }
}
