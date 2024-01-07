import java.util.*;

public class cha {
    public static void main(String[] args) {
        System.out.print("Enter the no. lines : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';

        for(int i=1;i<=n;i++){
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch);
                ch++;
            }
        System.out.println();  
        }
    }
}
