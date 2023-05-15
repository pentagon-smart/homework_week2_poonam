package homework;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value:");
        float a = obj.nextFloat();
        float Celsius = ((a - 32) * 5) / 9;
        System.out.println("Convert into Celsius : " + Celsius);
    }
}
