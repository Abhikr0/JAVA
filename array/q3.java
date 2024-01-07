public class q3 {
    public static int profit(int array[]) {
        int pro=0;
        int largest=Integer.MIN_VALUE;

        for(int i=1;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
                pro=largest-array[1];
            }
        }return pro;
        
    }
    public static void main(String[] args) {
        int array[]={7,6,4,3,1};
        System.out.println(profit(array));
    }
}
