import java.util.Scanner;

/**
 * Lecture 20: Array in Java (Part 4) - Using Loop
 */
public class Lecture20 {
    public static void main(String[] args) {
        // index ---->    0    1  2   3    4   5    6
//        int[] numbers = {100, 14, 20, 32, 543, 16, 20};
//        for (int x : numbers) {
//            System.out.println(x);
//        }
//
//        System.out.println("Length of the array: " + numbers.length);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[5]);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = input.nextInt();
        int[] myArr = new int[n];

        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            myArr[i] = input.nextInt();
        }
//        myArr[0] = input.nextInt();
//        myArr[1] = input.nextInt();
//        System.out.println("Total: " + (myArr[0] + myArr[1]));
        int sum = 0;
        System.out.print("My Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(myArr[i] + " ");
            sum = sum + myArr[i];
        }

        System.out.println("\nTotal: " + sum);
    }
}
