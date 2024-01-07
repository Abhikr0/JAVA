public class isprime{
public static boolean sprime(int x) {
        boolean sprime=true;
        for(int i=2;i<=x-1;i++){
            if(x%i==0){
                sprime=false;
                break;
            }
        }
        return true;
    }
public static void pprime(int n) {
    for(int i=2;i<=n;i++){
        if(sprime(i)){
        System.out.println(i+" ");
        }
    }
    System.out.println();
}
    public static void main(String[] args) {
        pprime(20);
    }
}

