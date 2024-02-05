public class methodol {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum((float)1.2,(float)1.6));
        System.out.println(c.sum(1,2,3));
    }

}
class Animal{
    void eat 
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}