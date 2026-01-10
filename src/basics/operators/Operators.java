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

    }
}
