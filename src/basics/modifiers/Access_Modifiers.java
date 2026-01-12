package basics.modifiers;

public class Access_Modifiers {
    /*We have 4 different types of modifiers: public, private, default, protected*/
    //private -> accessible only within the class in which they are declared, commonly used in inheritance based designs
    //public -> can be accessed from anywhere inside or outside the package

    private String name; //private scope
    String model; //default scope
    protected int val = 5;

    public void setName(String name){
        this.name = name; //accessible within the class
    }

    public  String getName(){
        return name;
    }
}
