import java.util.*;
public class numberprint {
    public static void main(String[] args) {
        System.out.print("Enter the upto number :");
        Scanner sc=new Scanner(System.in);
        int counter=sc.nextInt();
        int i=1;

        while(i<=counter){
            System.out.println(i);
            i++;
        }
    }
}
