public class halfpir {
    public static void pir(int row) {
        for(int i=1;i<=row-1;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }  
    }
    public static void main(String[] args) {
        pir(5);
    }
}
