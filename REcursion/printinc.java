public class printinc {
    public static void prntincr(int n) {
        if(n==1){
            System.out.print(n);
            return;
        }
        prntincr(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        int n=10;
        prntincr(n);
    }
}
