package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        boolean c = true;


        // write your code below

        if (a & c){
            System.out.println("a and c are both true");
        }
        if (b && c) {
            System.out.println("b is false and c is true but that's just how a short circuit AND works ah haha");
        }

        if (a | b){
            System.out.println("a or b is true");
        }
        if (a || b ) {
            System.out.println("a is true, we'll never know if b is true just from this operation");
        }

        if (a ^ b ){
            System.out.println("a OR b is true, but only one of them");
        }

        if (!b) {
            System.out.println("the opposite of b is true");
        }

    }

}

