package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */
public class Programme10 {
    public static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod(){
        System.out.print("Input a number: ");
        int num1 = obj.nextInt();

        for (int i=0; i< 10; i++)
        {
            System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
        }
    }
}

