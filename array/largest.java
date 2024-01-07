public class largest {
    public static int large(int array[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int array[]={2,4,5,7,3,9,4,7,4,4};
        System.out.println("The largest number is : " + large(array));
    }
}
