import java.util.Scanner;

/**
 * Lecture 07: More about Console Input (Part 1)
 */
public class Lecture07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 144 256
        // 789 6987
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("num1 = " + num1 + " num2 = " + num2);

        char myChar = input.next().charAt(0);
        System.out.println("myChar = " + myChar);

        String myString = input.next();
        System.out.println("myString = " + myString);
    }
}
