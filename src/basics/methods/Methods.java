package basics.methods;

public class Methods {
    public static void main(String args[]){
        /*When a method is called, Java uses an internal structure known
         as the call stack to manage execution, variables, and return addresses.
         */

        /* Call Stack : a data structure used by the program during runtime to manage method calls and local variables. It operates in a Last-In-First-Out (LIFO) manner,
         meaning the last method called is the first one to complete and exi
         */

        /*How are methods executed?
        When a method is called,
            1. A new stack frame is added to the call stack to store method details
            2. The method runs its code.
            3. After execution, the stack frame is removed, and control goes back to the calling method

         */

        //Java automatically manages the call stack using the Java Virtual Machine (JVM).

        //Types of Methods:
        // 1. Predefined Methods
        /*method that is already defined in the Java class libraries.
         It is also known as the standard library method or built-in method. For example, random()*/

        double val = Math.random();
        System.out.println("Random value generated is: "+val);

        //2.User defined metohds:
        /*The method written by the user or programmer is known as a user-defined method.
         These methods are modified according to the requirement*/

        //Ways to create java methods --> TODO
    }
}
