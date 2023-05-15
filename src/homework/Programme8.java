package homework;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme8 {
    public static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod(){
        System.out.println("Enter Base Value");
        float b = obj.nextFloat();
        System.out.println("Enter Height Value");
        float h = obj.nextFloat();
        float area = (b*h) / 2;
        System.out.println("Area of triangle is: " +area);
    }
}
