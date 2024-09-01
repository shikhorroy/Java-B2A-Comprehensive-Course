package basic;

import java.util.Scanner;

/**
 * Lecture 12: Control Flow/Control Statement
 */
public class Lecture12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        if (x == y) {
            System.out.println("both are equal");
        } else if (x > y) {
            System.out.println("x is bigger");
        } else {
            System.out.println("y is bigger");
        }
    }
}
