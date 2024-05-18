import java.util.Scanner;

/**
 * Lecture 08: More about Console Input (Part 2) - nextLine() trap
 */
public class Lecture08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read the full line:
//        String theLine = input.nextLine();
//        System.out.println("theLine = " + theLine);

//        int num1 = input.nextInt();
//        System.out.println(num1);

        int num2 = input.nextInt();
        System.out.println("num2 = " + num2);

        // read the full line:
        input.nextLine();
        String theLine = input.nextLine();
        System.out.println("theLine = " + theLine);
    }
}
