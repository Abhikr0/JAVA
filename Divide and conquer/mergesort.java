public class mergesort {
    // for printing elements in an array
    public static void Printarr(int[] arr) {
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // break and then merge
    public static void mergeS(int[] arr,int si,int ei) {
        if(si>=ei){
            return;
        }
        // for breaking
        int mid=si+(ei-si)/2;
        mergeS(arr, si,mid);
        mergeS(arr, mid+1,ei);
        // for merge
        merge(arr,si,mid,ei);
    }
    // for merge function
    
    public static void merge(int[] arr,int si,int mid,int ei) {
        // for making new array with length of (last index-start index+1)
        int[] temp=new int[ei-si+1];
        // i for first half of first broken array
        int i=si;
        // j for second half middle iterator
        int j=mid+1;
        // iterator for new temp array
        int k=0;

        // compare the elements in both array and inserting the value
        while(i<=mid && j<=ei ){
            // for the first array
            if(arr[i]<arr[j]){
                temp[k]=arr[i];  
                i++;
            }
            // for second array if it is greater
            else{
                temp[k]=arr[j];
                j++;
            }
            
            k++;
        }
        // for left array 
        while (i<=mid) { 
            temp[k++]=arr[i++];
            // k++ is the the form of writing the array making the increment and writing the value
        }
        // for the right array
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        // printing array in original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,4,5,3,5,6,2,9,7,8};
        mergeS(arr, 0, arr.length-1);
        Printarr(arr);
    }
}
