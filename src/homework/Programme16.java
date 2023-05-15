package homework;

import java.util.Scanner;


/**
 * Write a Java program to add two binary numbers.
 */
public class Programme16 {
    private static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {
    myMethod();
    }
    public static void myMethod(){
        System.out.println("Input first binary number: ");
        String b1 = obj.nextLine();
        System.out.println("Input second binary number: ");
        String b2 = obj.nextLine();

        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);

        int output = num1 + num2;

        System.out.print("Sum of two binary numbers: ");
        System.out.print(Integer.toBinaryString(output));
    }
}
