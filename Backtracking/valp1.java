public class valp1 {
    public static void backtracking(int arr[],int i,int val) {
        if(i==arr.length){
            printarr(arr);
        }

        arr[i]= val;
        backtracking(arr, i++, val);
        arr[i]=arr[i]-2;
    }
    public static void printarr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,42,4,3,5,2,3};
        
    }
}
