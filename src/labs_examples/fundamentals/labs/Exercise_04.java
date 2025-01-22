package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {


        int i = 999999999;
        System.out.println("int i is: " + i);

        // write your code below
        boolean boolAnswer = false;
        System.out.println("the variable boolAnser is: " + boolAnswer);

        char charActer = 'b';
        System.out.println("the variable charActer contains: " + charActer);

        String stringOfChars = "String is string";
        System.out.println("the variable stringOfChars contains: " + stringOfChars);

        byte byteNum = 123;
        System.out.println("the variable byteNum contains: " + byteNum);

        short shortNum = 12345;
        System.out.println(("shortNum: " + shortNum));

        long longNum = 1234567890;
        System.out.println("longNum: " + longNum);

        float floatNum = 1234567890.00000001f;
        System.out.println("floatNum: " + floatNum);

        double doubleNum = 12345.123456789123456789123456789d;
        System.out.println("doubleNum: " + doubleNum);

        i++;
        System.out.println("int i is: " + i);





    }

}
