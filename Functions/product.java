import java.util.*;

public class product {
    public static int multiply(int a,int b) {
        int product;
        product=a*b;
        return product;
    }
    public static void main(String[] args) {
        int pro;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int A=sc.nextInt();
        int B=sc.nextInt();

        pro=multiply(A,B);

        System.out.println(pro);
        sc.close();
    }
    
}

