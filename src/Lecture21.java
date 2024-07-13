/**
 * Lecture 21: Shorthand Assignment Operator
 */
public class Lecture21 {
    public static void main(String[] args) {
        int x = 10;
//        x = x + 20;
        x += 20;
        System.out.println("x = " + x);

        int y = 11;
        int z = 3;
//        y = y - z;
        y -= z;
        System.out.println("y = " + y);

        int a = 11;
        int b = 3;
//        a = a / b;
        a /= b;
        System.out.println("a = " + a);
    }
}
