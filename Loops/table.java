import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int mul=0;
        
        for(int i=1;i<=10;i++){
        mul=N*i;
        System.out.println(N+"X"+i+"="+mul);
        }
    }
}
