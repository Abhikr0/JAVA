public class prion {
    public static boolean isprime(int x) {
        boolean isprime=true;
        for(int i=2;i<=x-1;i++){
            if(x%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(isprime(5));
    }
}
