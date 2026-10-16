package day_8;

public class SingleEmployee {
    static final SingleEmployee obj = new SingleEmployee();

    private SingleEmployee() {

    }
     public static SingleEmployee makeInstance() {
        return new SingleEmployee();
     }
     public String getMessage() {
         return "Hey i have the private singleton object now";
     }
}