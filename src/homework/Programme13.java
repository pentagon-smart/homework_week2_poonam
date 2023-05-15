package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class Programme13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = obj.nextInt();
        System.out.println("Enter Second Number");
        int b = obj.nextInt();
        System.out.println("Enter Third Number");
        int c = obj.nextInt();
        double avg = (a+b+c)/3;
        System.out.println("Average of three number : " +avg);
        }
    }

