/**
 * Lecture 15: Array in Java (Part 1)
 */
public class Lecture15 {
    public static void main(String[] args) {
//        int a;
//        int b;
//        int c;
//        int d;
//        int e;
//        int f;
//        int g;
//        int h;
//        int i;
//        int j;
        int a, b, c, d, e, f, g, h, i, j;
        // type[] arr = new type[SIZE];
        int[] intArr = new int[10];
//        String[] strings = new String[100];

        intArr[0] = 10;
        intArr[1] = 56;
        intArr[2] = 35;

//        System.out.println(intArr[0] + intArr[1]);
//        System.out.println(intArr.length);

        int[] anotherArr = {10, 20, 10, 30};
        System.out.println(anotherArr[0] + " " + anotherArr[1] + " " + anotherArr[2] + " " + anotherArr[3]);
        System.out.println(anotherArr.length);

        anotherArr[2] = 15;
        System.out.println(anotherArr[2]);
    }
}
