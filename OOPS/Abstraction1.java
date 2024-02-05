public class Abstraction1 {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // h.changeColor();
        // Hen c = new Hen();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);
        Mustang m = new Mustang();
        
    }
}

abstract class Animal{
    String color;

    Animal(){
        color = "brown";
        System.out.println("animal constructor class ");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void changeColor(){
        color = "Blue";
    }
    void walk(){
        System.out.println("walk");
    }
}
class Hen extends Animal {
    void walk(){
        System.out.println("walk hen");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang");
    }
}