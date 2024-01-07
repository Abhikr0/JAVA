import java.util.*;

public class search {
    public static boolean search(int matrix[][],int key) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell" +i+","+j);
                    return true;
                }
            }  
        }
        System.out.println("key not found");
        return false;
    }
}
