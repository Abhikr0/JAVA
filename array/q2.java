public class q2 {
    public static int pivot(int array[],int target) {
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,3,2,1,4,2,32,23,2,3};
        int target=25;
        System.out.println("the key is"+pivot(array, target));
    }
}
