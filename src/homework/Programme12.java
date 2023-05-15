package homework;

import java.util.Scanner;

/**
 * Write a Java program to compute the specified expressions and print the output.
 */

public class Programme12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Value1");
        double a = obj.nextDouble();
        System.out.println("Enter Value2");
        double b = obj.nextDouble();
        System.out.println("Enter Value3");
        double c = obj.nextDouble();
        System.out.println("Enter Value4");
        double d = obj.nextDouble();
        double result = ((a * b - b * b) / (c - d));
        System.out.println("Expected Output : " +result);
        }
    }

