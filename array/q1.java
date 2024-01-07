public class q1 {
    public static boolean same(int array[]) {
        int n=array.length;

        for(int i= 0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int array[]={1,2,4,2,3,5};
        same(array);
    }
}
