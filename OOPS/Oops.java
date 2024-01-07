
public class Oops {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        BankAccount Account = new BankAccount();
        Account.username ="Abhishek";
        Account.setPassword("nopassword");

        Student s1 = new Student("Abhishek");
        Student s2 = new Student();
        Student s3 = new Student(34);
        System.out.println(s1.name);
    }
}
class BankAccount {
    public String username;
    private String password;
    public  void setPassword(String psw) {
        password = psw;
    }
}
class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int roll;

// this 

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll=roll;
    }
    Student(){
        System.out.println("this is an non parameter object");
    }

class Animal {
    String color;

    void eat(){
        System.out.println();
    }

    void breath(){
        System.out.println();
    }
}

class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println();
    }
}

}






