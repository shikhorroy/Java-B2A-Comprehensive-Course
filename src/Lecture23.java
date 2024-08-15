/**
 * Lecture 23: Continue Statement in Java
 */
public class Lecture23 {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("outside loop: " + i);
    }
}
