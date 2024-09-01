package basic;

public class Lecture05 {
    public static void main(String[] args) {
        int x = 127;
        int y = 220;

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
