public class binarysearch {
    public static int bs(int array[],int scan) {
        int len=array.length;
        int s=array[0];
        int end=len-1;

        while(s<=end){
            int mid=s+end/2;
        if(array[mid]==scan){
            System.out.print("the number is found");
            return mid;
        }
        if(array[mid]>scan){
            end=mid-1;
        }
        else{
            s=mid+1;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] ={2,5,3,6,4,7,10,8,54,34};
        int scan=10;

        System.out.println("the key is"+bs(array, scan));
    }
}
