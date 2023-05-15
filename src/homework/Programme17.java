package homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 */


public class Programme17 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input a Decimal Number");
        int dec = obj.nextInt();

        String bin = Integer.toBinaryString(dec);
        System.out.println("Binary number is: " +bin);
    }
}

