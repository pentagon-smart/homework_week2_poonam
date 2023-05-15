package homework;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 */
public class Programme14 {
    public static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        System.out.println("Enter Width Value");
        double w = obj.nextDouble();
        System.out.println("Enter Height Value");
        double h = obj.nextDouble();
        double area = w * h;
        System.out.println("Area is:" + area);
        double perimeter = 2 * w + 2 * h;
        System.out.println("Perimeter is:" + perimeter);
    }

}

