package basic;

import java.util.Scanner;

/**
 * Lecture 26: Java Method
 */
public class Lecture26 {
    public static void main(String[] args) {
//        System.out.println("Hello Programmers!");
//
//        double division = divideTwoNumbers(10.0, 5.0);
//        System.out.println(division);
        System.out.println("====================================");
        System.out.println("\tWelcome to Basic Calculator");
        System.out.println("====================================");
        System.out.println("I Can Add(+), Subtract(-), Multiply(*) and Divide(/) Two Numbers.\n");

        while (true) {
            System.out.println("Provide your input as:\n\t[FIRST NUMBER] [OPERATOR] [SECOND NUMBER]");

            Scanner input = new Scanner(System.in);
            double firstNumber = input.nextDouble();
            char operator = input.next().charAt(0);
            double secondNumber = input.nextDouble();

            double result = caculate(firstNumber, secondNumber, operator);
            System.out.println("\nResult:");
            System.out.printf("%.2f %c %.2f = %.2f\n\n", firstNumber, operator, secondNumber, result);

            System.out.println("Want to calculate again? (y/n): ");
            char wantToContinue = input.next().charAt(0);
            if (wantToContinue == 'n') break;
        }
    }

    public static double caculate(double firstNumber, double secondNumber, char operator) {
        double result = 0.0;
        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
        }
        return result;
    }

    public static double divideTwoNumbers(double num1, double num2) throws ArithmeticException {
        double result = num1 / num2;
        return result;
    }
}
