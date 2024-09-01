package basic;

/**
 * Lecture 22: Break Statement in Java
 */
public class Lecture22 {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 10; i++) {
            System.out.println(i);
            if(i == 5) {
                break;
            }
        }
        System.out.println("outside loop: " + i);
    }
}
