import java.util.*;
public class sumn {
    public static void main(String[] args) {
        System.out.print("Enter the nth term");
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();
        int i=1;
        int sum=0;

        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("the Sum of Nth term"+sum);
    }
}
