package homework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class Programme6 {
    public static void main(String[] args) {
        System.out.print("Enter any radius value of circle: ");
        Scanner obj = new Scanner(System.in);
        Double radius = obj.nextDouble();

        Double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
    }
}
