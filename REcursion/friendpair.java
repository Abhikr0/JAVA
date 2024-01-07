public class friendpair {
    public static int friend(int n) {
        if(n==1||n==2){
            return n;
        }
        return friend(n-1)+(n-1)*friend(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friend(3));
    }
}
