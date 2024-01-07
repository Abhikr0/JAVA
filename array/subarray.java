

public class subarray {
    public static void sub(int suba[]) {
        for(int i=0;i<suba.length;i++){
            int start=i;
            for(int j=i;j<suba.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(suba[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int suba[]={2,4,6,8,10};
        sub(suba);
    }
}
