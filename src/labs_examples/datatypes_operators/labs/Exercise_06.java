package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        float r = 3.14f;
        int h = 5;

        System.out.println("the volume of the cylinder is: " + (3.14 * r * r * h));
        System.out.println(" The surface area of the cylinder is: " + (2 * 3.14 * r * h + 2 * 3.14 * r * r) );

    }
}