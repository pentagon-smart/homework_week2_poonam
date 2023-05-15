package homework;
import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 */
public class Programme18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = obj.nextInt();

        System.out.print("Input second number: ");
        int num2 = obj.nextInt();

        int a1 = (num1 + num2);
        System.out.println(num1 + " + " + num2 + " = " +a1 );
        int a2 = (num1 - num2);
        System.out.println(num1 + " - " + num2 + " = " +a2);
        int a3 = (num1 * num2);
        System.out.println(num1 + " x " + num2 + " = " +a3);
        int a4 = (num1 / num2);
        System.out.println(num1 + " / " + num2 + " = " +a4);
        int a5 = (num1 % num2);
        System.out.println(num1 + " mod " + num2 + " = " +a5);
    }

}
