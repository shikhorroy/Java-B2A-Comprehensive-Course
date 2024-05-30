/**
 * Lecture 14: Increment & Decrement Operators in Java
 */
public class Lecture14 {
    public static void main(String[] args) {
        int x = 10;

//        int plusOne = x + 1;
//        System.out.println("plusOne: " + plusOne + ", x: " + x);

//        x = x + 1;
        int y = x++;// increment operator
        System.out.println("x: " + x + ", y: " + y);

        int z = ++x;
        System.out.println("x: " + x + ", z: " + z);

//        x = x - 1;
        int a = x--;// decrement operator
        System.out.println("x: " + x + ", a: " + a);

        int b = --x;
        System.out.println("x: " + x + ", b: " + b);
    }
}
