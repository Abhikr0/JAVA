
public class letter {
    public static void printletter(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String firstname="Abhishek";
        String lastname="Kumar";
        String fullname=firstname + lastname;

        printletter(fullname); 

    }
}
