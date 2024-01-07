public class bin {
    public static void bintodec(int x) {
        int pow=0;
        int digit=0;
        int og=x;
        while(x>0){
            int lastdigit=x%10;
            digit=digit+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            x=x/10;
        }
        System.out.println("decimal of  " + og + " is " + digit);
    }
    public static void main(String[] args) {
        bintodec(101);
    }
}
