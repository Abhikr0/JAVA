import java.util.*;
public class reversegiven {
    public static void main(String[] args) {
        System.out.println("Enter the given number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int last;

        while(n>0){
            last=n%10;
            rev=(rev*10)+last;
            n=n/10;
        }
        System.out.println(rev);
    }
    
}
