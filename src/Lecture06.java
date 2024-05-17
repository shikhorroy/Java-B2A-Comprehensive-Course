import java.util.Scanner;
/**
 * Lecture 06: import and User Input from Console
 */
public class Lecture06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first value: ");
        int x = input.nextInt();
        System.out.println("Enter your second value: ");
        int y = input.nextInt();

        // before swapping:
        System.out.println("Before swapping:");
        System.out.println("x = " + x + " y = " + y);

        // swapping two values:
        int tempVar = x;
        x = y;
        y = tempVar;

        // after swapping:
        System.out.println("After swapping:");
        System.out.println("x = " + x + " y = " + y);
    }
}
