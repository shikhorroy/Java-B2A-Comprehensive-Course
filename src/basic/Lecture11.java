package basic;

/**
 * Lecture 11: Arithmetic Operators
 */
public class Lecture11 {
    public static void main(String[] args) {
        int operand1 = 10;
        int operand2 = 3;

        // arithmetic operations:
        int summation = operand1 + operand2;
        int subtraction = operand1 - operand2;
        int multiplication = operand1 * operand2;
        double division = (1.0 * operand1) / operand2;
        int modulus = operand1 % operand2;

        // 10 - 3 = 7
        System.out.printf("%d + %d = %d\n", operand1, operand2, summation);
        System.out.printf("%d - %d = %d\n", operand1, operand2, subtraction);
        System.out.printf("%d * %d = %d\n", operand1, operand2, multiplication);
        System.out.printf("%d / %d = %f\n", operand1, operand2, division);
        System.out.printf("%d %% %d = %d\n", operand1, operand2, modulus);

//        System.out.println(11.0 / 5);
    }
}
