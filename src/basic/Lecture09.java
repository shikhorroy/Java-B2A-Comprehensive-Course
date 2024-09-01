package basic;

import java.util.Scanner;

/**
 * Lecture 09: More about Console Output (Part 1)
 */
public class Lecture09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.print("sum = " + sum + "\n");
    }
}
