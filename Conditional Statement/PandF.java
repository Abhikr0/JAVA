import java.util.*;

public class PandF {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int marks =sc.nextInt();

        String check=(marks>=33)? "pass":"fail";

        System.out.println(check);
        sc.close();
    }
}
