public class searchingmatrix {
    public static boolean serc(int matrix[][],int key) {
        int row=0,col=matrix[0].length-1;

        while(row < matrix.length && col>=0){
            if(matrix[row][col]== key){
                System.out.println("Key found at ("+row +"," + col +")");
            return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }
        }
        System.out.println("key not found");
    }
    public static void main(String[] args) {
        
    }
}
