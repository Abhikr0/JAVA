public class sumofn {
    public static int sum(int n) {
        if(n==0){
            return 1;
        }
        int fn1=sum(n-1);
        int fn=n+fn1;
        return fn;
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
