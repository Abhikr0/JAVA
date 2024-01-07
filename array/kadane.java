public class kadane {
    public static void mss(int number[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<number.length;i++){
            cs+=number[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("our maximum subarray sum are :" + ms);
    }
    public static void main(String[] args) {
        int number[]={-1,-7,4,6,8,10};
        mss(number);
    }
}

