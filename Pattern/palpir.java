public class palpir {
    public static void pyr(int n) {
        for(int i=1;i<=n;i++){
            int counter=0;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyr(5);
    }
}

