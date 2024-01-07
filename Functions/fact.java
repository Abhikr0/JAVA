import java.util.*;

public class fact {
    public static int factn(int n) {
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for the Factorial : ");
        int a=sc.nextInt();
        int b;
        b=factn(a);

        System.out.println(b);
        sc.close();
    }
}
