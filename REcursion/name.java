public class name {
    public static void printNtimes(int n){
        if(n==1){
            System.out.println("Coding Ninjas");
            return;
        }
        System.out.print("Coding Ninjas"+" ");
        printNtimes(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printNtimes(n);
    }
}
