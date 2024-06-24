/**
 * Lecture 19: Loop (Part 2) - while loop, do-while loop, enhanced for loop
 */
public class Lecture19 {
    public static void main(String[] args) {
        // for loop:
        // summation of: 1 + 2 + 3 + 4 + ..... + 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);

        // while loop:
        int sum2 = 0;
        int i = 1;
        while (i <= 100) {
            sum2 = sum2 + i;
            i++;
        }
        System.out.println("sum2 = " + sum2);

        // do while loop:
        int sum3 = 0;
        int j = 1;
        do {
            sum3 = sum3 + j;
            j++;
        } while (j <= 100);
        System.out.println("sum3 = " + sum3);

        // enhanced for loop:
        int sum4 = 0;
        int[] nums = {199, 225, 36, 55, 100};
        for (int x : nums) {
//            System.out.println(x);
            sum4 = sum4 + x;
        }
        System.out.println("sum4 = " + sum4);
    }
}