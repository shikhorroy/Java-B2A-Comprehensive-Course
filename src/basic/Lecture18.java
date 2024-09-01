package basic;

/**
 * Lecture 18: Loop (Part 1) - for loop
 */
public class Lecture18 {
    public static void main(String[] args) {

        // for(initialization; termination/condition; increment/decrement/update) {}
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Welcome to Java Programming");
//        }

        // print: 1 2 3 4 ..... 50
//        for (int i = 1; i <= 50; i++) {
//            System.out.println(i);
//        }

        // reverse order:
//        for (int i = 50; i >= 1; i--) {
//            System.out.println(i);
//        }

        // summation of: 1 + 2 + 3 + 4 + ..... + 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
