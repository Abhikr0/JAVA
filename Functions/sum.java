import java.util.*;
public class sum {
    public static int add(int num1,int num2) {
        int sum;
        sum=num1+num2;
        System.out.println("the Sum Of the numbers are :"+sum);
        return sum;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
        sc.close();
    }
}
