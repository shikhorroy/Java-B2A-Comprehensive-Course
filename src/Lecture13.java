import java.util.Scanner;

/**
 * Lecture 13: Lecture 13 - Let's Create a Console Application - Basic Calculator
 */
public class Lecture13 {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("\tWelcome to Basic Calculator");
        System.out.println("====================================");
        System.out.println("I Can Add(+), Subtract(-), Multiply(*) and Divide(/) Two Numbers.\n");

        System.out.println("Provide your input as:\n\t[FIRST NUMBER] [OPERATOR] [SECOND NUMBER]");

        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        char operator = input.next().charAt(0);
        double secondNumber = input.nextDouble();

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
        System.out.println("\nResult:");
        System.out.printf("%.2f %c %.2f = %.2f", firstNumber, operator, secondNumber, result);
    }
}
