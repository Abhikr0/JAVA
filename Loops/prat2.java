import java.util.*;
public class prat2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        int num;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.println("Enter the number :");
            num=sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
            System.out.println("Enter 1 to continue or 0 to Exit");
            choice=sc.nextInt();
            }while(choice==1);

        System.out.println("Sum of the odd numbers are : " + oddSum);
        System.out.println("Sum of the even numbers : " + evenSum);
    }
}
