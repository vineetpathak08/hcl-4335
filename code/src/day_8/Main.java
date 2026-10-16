package day_8;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World to singleton pattern");
        SingleEmployee obj1 = SingleEmployee.makeInstance();
        SingleEmployee obj2 = SingleEmployee.makeInstance();
        System.out.println(obj2 == obj1);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.getMessage());

    }
}

