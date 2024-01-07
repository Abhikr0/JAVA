import java.util.*;
public class disp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("Enter the number : ");
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }System.out.println("the number You have entered : "+num);
        }
        while(true);
    }
}
