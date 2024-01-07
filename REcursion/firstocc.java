public class firstocc {
    public static int  first(int[] arr,int key,int i) {
        if(arr[i]==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return(first(arr, key,i+1));
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(first(arr, 10, 0));
    }
}
