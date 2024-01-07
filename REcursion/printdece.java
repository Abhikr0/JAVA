public class printdece {
    public static void pridec(int n) {
        //break
        if(n==1){
            System.out.println(n);
            return;
        }
        //what to print
        System.out.print(n+" ");
        //inner call
        pridec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        pridec(n);
    }
}
