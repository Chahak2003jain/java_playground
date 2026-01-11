package basics.operators;

public class Operators {
    public static void main(String args[]){
        /*Java divides the operators into the following groups:
        Arithmetic operators
        Assignment operators
        Comparison operators
        Logical operators
        Bitwise operators
        */

        // 1. Arithmetic operators : +, -, /, %, ++, --
        //Assignment operatos : +=,-=, *=, &=, |=, ^=, >>=, <<=
        System.out.println(3 & 1); //011 AND 001
        System.out.println(3 | 1); // 011 OR 001
        System.out.println(3 >> 1); //011 should be right shifted by 1 position == 1
        System.out.println(3 << 1); //011 should be left shifted by 1 position == 6

        //comarison operator
        /*Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.

                The return value of a comparison is either true or false*/
        int x = 5;
        int y = 3;
        System.out.println(x > y);
        //Logical operator ->&&,||, !
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));

        //Java operator precendance: When a calculation contains more than one operator, Java follows order of operations rules to decide which part to calculate first.
        int result1 = 2 + 3 * 4;     // 2 + 12 = 14
        int result2 = (2 + 3) * 4;   // 5 * 4 = 20

        System.out.println(result1);
        System.out.println(result2);
        //Order of operations:
        /*      () - Parentheses
                *, /, % - Multiplication, Division, Modulus
                +, - - Addition, Subtraction
                >, <, >=, <= - Comparison
                ==, != - Equality
                && - Logical AND
                || - Logical OR
                = - Assignment */
        //Bitwise operators: A bitwise operator is a symbol or keyword that tells the computer what operation to perform, bit by bit, on values or variables.
        /* & (Bitwise AND)
            | (Bitwise OR)
            ^ (Bitwise XOR)
            ~ (Bitwise NOT)
            << (Left shift)
            >> (Right shift)
         */
    }
}
