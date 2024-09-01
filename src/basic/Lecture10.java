package basic;

/**
 * Lecture 10: More about Console Output (Part 2)
 */
public class Lecture10 {
    public static void main(String[] args) {
        // Format Specifier:
        //      %[...flag][width][.precision]converter

        //---------------------------------------------------------//
        // Integral Number: byte, short, integer, long, BigInteger //
        // Specifier: %d                                           //
        //---------------------------------------------------------//
//        int myInt = 1234567890;
//        System.out.printf("myInt = " + myInt);
//        System.out.printf("myInt = %d\n", myInt);
//        System.out.printf("myInt = |%15d|\n", myInt);// %[width]converter
//        System.out.printf("myInt = |%-15d|\n", myInt);// %[flag][width]converter
//        System.out.printf("myInt = |%5d|\n", myInt);// no data loose
//        System.out.printf("myInt = |%,15d|\n", myInt);// group character flag
//        System.out.printf("myInt = |%015d|\n", myInt);// padding
//        System.out.printf("myInt = |%+15d|\n", myInt);// include sign


        //--------------------------------------------------------//
        // Decimal Number: float, double, BigDecimal              //
        // Specifier: %f                                          //
        //--------------------------------------------------------//
//        double myDouble = 12345.67890;
//        System.out.printf("myDouble = %f\n", myDouble);
//        System.out.printf("myDouble = |%15f|\n", myDouble);// %[width]converter
//        System.out.printf("myDouble = |%-15f|\n", myDouble);// %[flag][width]converter
//        System.out.printf("myDouble = |%3f|\n", myDouble);// no data loose
//        System.out.printf("myDouble = |%,15f|\n", myDouble);// group character flag
//        System.out.printf("myDouble = |%015f|\n", myDouble);// padding
//        System.out.printf("myDouble = |%+15f|\n", myDouble);// include sign
//        System.out.printf("myDouble = |%15.7f|\n", myDouble);//  %[width][.precision]converter
//        System.out.printf("myDouble = |%15.2f|\n", myDouble);//  rounding

        //--------------------------------------------------------//
        // String: String                                         //
        // Specifier: %s                                          //
        //--------------------------------------------------------//
//        String myString = "this is a line.";
//        System.out.printf("myString = %s\n", myString);
//        System.out.printf("myString = |%20s|\n", myString);
//        System.out.printf("myString = |%-20s|\n", myString);// %[flag][width]converter
//        System.out.printf("myString = |%-20.11s|\n", myString);// %[flag][width][.precision]converter
//        System.out.printf("myString = |%20.11s|\n", myString);// %[flag][width][.precision]converter

        // Character, Boolean:
        System.out.printf("%c\n", 'S');
        System.out.printf("%b\n", true);
        System.out.printf("%B\n", false);
    }
}
