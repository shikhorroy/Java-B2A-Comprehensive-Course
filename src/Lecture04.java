/**
 * Lecture 04: Comments in Java.
 */
public class Lecture04 {
    /**
     * We are going to practice Java comments.
     * Here we will practice 3 types of comments.
     * <p>
     * Type 01: Single line comment
     * <p>
     * Type 02: Multiline comment
     * <p>
     * Type 03: Javadoc comment
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        // this is our 1st number
        int num1 = 20;
        // this is our 2nd number
        int num2 = 5;


        int sum = num1 + num2;// summation of 1st and 2nd number
        /*
        This is an example of multiline comment.
        We will print summation here.
         */
        System.out.println(sum);
    }
}
