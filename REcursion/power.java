public class power {
    public static int  Optimized(int a,int n) {
        if(n==0){
            return 1;
        }
        int halfpower= Optimized(a, n/2);
        int halfpowerfn=halfpower*halfpower;
        
        if(n % 2 != 0){
            halfpowerfn=a*halfpower*halfpower;
        }

        return halfpowerfn;

    }
    public static void main(String[] args) {
        int a=2;
        int n=4;

        System.out.println(Optimized(a, n));
    }
}
