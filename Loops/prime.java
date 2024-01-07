import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();

        if(n==2){
            System.out.println("The Number is Prime");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("The Number is Prime");
            }else{
                System.out.println("The Number is not Prime");
            }
            
        }
    }
}
