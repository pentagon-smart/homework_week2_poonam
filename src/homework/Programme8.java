package homework;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Base Value");
        float b = obj.nextFloat();
        System.out.println("Enter Height Value");
        float h = obj.nextFloat();
        float area = (b*h) / 2;
        System.out.println("Area of triangle is: " +area);
    }
}
