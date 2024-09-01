package basic;

/**
 * Lecture 16: Array in Java (Part 2)
 */
public class Lecture16 {
    public static void main(String[] args) {
        double[] arr = new double[10];

        arr[0] = 20;
        arr[1] = 14;
        arr[2] = 23;
        arr[3] = 423;

        double[] anotherArr = arr;
        anotherArr[0] = anotherArr[0] * 2;
        anotherArr[1] = anotherArr[1] * 2;
        anotherArr[2] = anotherArr[2] * 2;
        anotherArr[3] = anotherArr[3] * 2;

        System.out.println("this is arr:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println("this is anotherArr:");
        System.out.println(anotherArr[0]);
        System.out.println(anotherArr[1]);
        System.out.println(anotherArr[2]);
        System.out.println(anotherArr[3]);

//        System.out.println(arr[20]);
        int myValue = 20;
        int anotherValue = myValue;

        anotherValue = 175;
        System.out.println("myValue = " + myValue + " anotherValue = " + anotherValue);
    }
}
