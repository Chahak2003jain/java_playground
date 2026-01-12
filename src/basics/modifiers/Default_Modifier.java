package basics.modifiers;

public class Default_Modifier {
    //when no access modifier is provided, it is said to have a default modifier
    // here classes within the same package can access this variable
    // varianles with default access can not be accessed outside the package

    public static void main(String args[]){
        Access_Modifiers ob = new Access_Modifiers();
        ob.model = "MARUTI SUZUKI";
        System.out.println("Model name is: "+ob.model);
    }
}
