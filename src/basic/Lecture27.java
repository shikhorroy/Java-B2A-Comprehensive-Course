package basic;

/**
 * Lecture 27: Logical Operators in Java
 */
public class Lecture27 {
    public static void main(String[] args) {
        // আমি এবং রাহাত আজকে ঘুরতে যাবো
        // ১০ এর থেকে বড় এবং জোড় সংখ্যা
        // 8

        int x = 18;
//        if (x > 10) System.out.println("x is greater than 10");
//        if (x % 2 == 0) System.out.println("x is an even number");

        // Logical And Operator:
        // (x > 10) এবং (x % 2 == 0)
//        if ((x > 10) && (x % 2 == 0)) {
//            System.out.println("x > 10 & x is even");
//        }

        // Logical Or Operator:
//        if ((x > 10) || (x % 2 == 0)) {
//            System.out.println("x > 10 or x is even");
//        }

        // Logical Not Operator:
        if ((x > 10) && (x % 2 == 0) && !(x == 20)) {
            System.out.println("inside if condition");
        }
    }
}
