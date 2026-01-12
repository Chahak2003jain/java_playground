package basics.modifiers;

public class Main {
    public static void main(String args[]){
        Protected_Inherited obj = new Protected_Inherited();
        obj.setSpeed(500);
        System.out.println("Speed is: "+obj.getSpeed());

        Protected_Modifier ob = new Protected_Modifier();
        System.out.println("The  original value is: "+ob.speed);
        System.out.println("Val: "+ob.val);
    }
}
