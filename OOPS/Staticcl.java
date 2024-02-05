public class Staticcl {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.schoolName = "JMV";
        // Student s2 = new Student();
        // System.out.println(s2.schoolName);
        Horse h = new Horse();
        
    }
}
class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    Student (){
        System.out.println("this is student");
    }
}
class Horse extends Student {
    Horse(){
        // super refers to immediate Parent class 
        super().schoolName = "New School";
        
        super();
        System.out.println("this is a Horse");
    }
}