package basics.typeCasting;

public class TypeCasting {
    public static void main(String[] args){
        /*There are two types of Type Casting in Java:

        Widening Type Casting or Implicit Casting or Upcasting
        Narrow Type Casting or Exlplicit Casting*/

        //1. Implicit casting: A lower data type is transformed into a higher one by a process known as widening type casting. Implicit type casting and casting down are some names for it. It occurs naturally. Since there is no chance of data loss, it is secure. Widening Type casting occurs when:

        //The target type must be larger than the source type.
        //Both data types must be compatible with each other.
        int i = 10;

        // Widening Type Casting (Automatic Casting) from int to long
        long l = i;

        // Widening Type Casting (Automatic Casting) from int to double
        double d = i;

        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);

        //2.Explicit Casting: The process of downsizing a bigger data type into a smaller one is known as narrowing type casting. Casting up or explicit type casting are other names for it. It doesn't just happen by itself. If we don't explicitly do that, a compile-time error will occur. Narrowing type casting is unsafe because data loss might happen due to the lower data type's smaller range of permitted values. A cast operator assists in the process of explicit casting.
        double m = 100.245;

        // Narrowing Type Casting
        short j = (short)m;
        int k = (int)m;

        System.out.println("Original Value before Casting: " + i);
        System.out.println("After Type Casting to short " + j);
        System.out.println("After Type Casting to int " + k);

        //TODO : types of explicit typecasting
    }

}
