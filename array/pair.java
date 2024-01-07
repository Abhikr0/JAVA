public class pair {
    public static void pairs(int num[]) {
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[] ={2,5,3,6,4,7,10,8};

        pairs(num);
    }
}
