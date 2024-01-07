public class swap {
    public static void swp(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        return ;
    }

    public static void main(String[] args) {
        int at=swp(4,6);
        System.out.println(at);
    }
}
