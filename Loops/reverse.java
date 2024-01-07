import java.util.*;
public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last;

        while(n>0){
            last=n%10;
            System.out.print(last);
            n=n/10;
        }
        System.out.println();
    }
}
