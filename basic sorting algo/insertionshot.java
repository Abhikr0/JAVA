public class insertionshot {
    public static void ins(int arr[]) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=i;
            int prev=i-1;
            //findout the correct pos
            while(prev>=0 && arr[prev] > arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=arr[curr];
        }
    }
    public static void main(String[] args) {
        int[] arr={2,1,4,3,5,3,4};
        ins(arr);
    }
}
