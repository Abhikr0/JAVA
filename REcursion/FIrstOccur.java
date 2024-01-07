public class FIrstOccur {
    public static int FirstOccurence(int[] arr,int key,int i) {
        if(i==arr.length-1){
            return -1;
        }
        
        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int[] arr={2,4,2,5,6,4,3,4};
        int key=5;
        System.out.println(FirstOccurence(arr, key, 0));
    }
}
