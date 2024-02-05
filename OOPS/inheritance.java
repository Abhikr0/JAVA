public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("Breath");
    }
}
// derived class or subclass 
class Fish extends Animal{
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}