public class hi {
    public static void hosq(int side) {
        for(int i=1;i<=side;i++){
            for(int j=1;j<=side;j++){
                if(i==side||j==side||j==1||i==1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hosq(5);
    }
} 
