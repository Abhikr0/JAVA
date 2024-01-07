public class reverse {
    public static void reverses(int number[]) {
        int start=0;
        int end=number.length-1;

        while(start<end){
            // swap
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int number[] ={2,5,3,6,4,7,10,8};

        reverses(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
        System.out.println();
    }
}
