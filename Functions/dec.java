public class dec {
    public static void decitobi(int x) {
        int pow=0;
        int bin=0;
        while(x>0){
            int rem=x%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            x=x/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        decitobi(10);
    }
}
