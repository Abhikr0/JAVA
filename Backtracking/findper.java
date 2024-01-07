public class findper {
    public static void backtracking(int arr[],int i,int val) {
        if(i==arr.length){
            printarr(arr);
        }

        arr[i]= val;
        backtracking(arr, i++, val);
        arr[i]=arr[i]-2;
    }

    public static void main() {
        
    }
}
