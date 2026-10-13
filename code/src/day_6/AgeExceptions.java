package day_6;



public class AgeExceptions extends RuntimeException {
    public AgeExceptions() {
        super();
    }

    public AgeExceptions(String message) {
        super(message);
    }

    public AgeExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}

class UserRegistration {

    public void registerUser(String name, int age) {
        if (age < 0 || age > 120) {
            throw new AgeExceptions("Validation failed: Age " + age + " is invalid. Must be between 0 and 120.");
        }
        System.out.println("User " + name + " registered successfully with age " + age + ".");
    }

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        try {

            registration.registerUser("Alice", 150);
        } catch (AgeExceptions e) {
            System.err.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}




//public class AgeExceptions extends RuntimeException{

//    public AgeExceptions(){
//        super();
//    }
//    public AgeExceptions(String message){
//        super(message);
//    }
//    public AgeExceptions(String message, Throwable cause){
//        super(message,cause);
//    }
//}
//
//class UserRegistration {
//    public void registerUser(int age, String name){
//        if(age < 0 || age > 100){
//            throw new AgeExceptions("Age out of range");
//        }
//        System.out.println("User " + name + " registered");
//    }
//
//    static void main() {
//        UserRegistration usr = new UserRegistration();
//        try{
//            usr.registerUser(34, "Bob");
//        }catch(AgeExceptions e){
//            System.out.println("caught custom error " + e.getMessage());
//        }
//    }
//}
