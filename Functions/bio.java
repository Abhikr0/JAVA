import java.util.*;

public class bio {
//factorical funcion
public static int f(int n) {
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }
//binomial Function
public static int binom(int N,int R) {
    
        int b=f(N);
        int c=f(R);
        int d=f(N-R);
        int bi=b/(c*d);
        return bi;
    }
//maininput
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for N : ");
        int N=sc.nextInt();
        System.out.println("Enter the number for R : ");
        int R=sc.nextInt();

        System.out.println("Binomial coefficient is :"+ binom(N,R));
        sc.close();
    }
}
