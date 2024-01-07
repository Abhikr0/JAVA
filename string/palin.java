public class palin {
    public static void main(String[] args) {
        String name= "noomen";
        int n=name.length();
        for(int i=0;i<n/2;i++){
            if(name.charAt(i)!=name.charAt(n-i-1)){
            System.out.println("is not palindrome");
            }
        }
        System.out.println("yes");
    }
    
}
