import java.util.*;
public class Year {
    public static void main(String[] args) {
        System.out.print("Enter the year : ");
        Scanner sc =new Scanner(System.in);
        int Year=sc.nextInt();
            if(Year%4==0&&Year%100!=0){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
