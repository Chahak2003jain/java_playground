package basics.modifiers;

public class Access_Modifiers {
    /*We have 4 different types of modifiers: public, private, default, protected*/
    //private -> accessible only within the class in which they are declared
    private String name;
    public void setName(String name){
        this.name = name; //accessible within the class
    }

    public  String getName(){
        return name;
    }
}
