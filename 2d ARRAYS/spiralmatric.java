public class spiralmatric {
    public static void spi(int matrix[][]) {
        //set the boundaries of the matrix
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        //start row 
        while(startrow<=endrow && startcol<=endcol){

            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            for(int j=endcol-1;j>=startcol;j--){
                System.out.print(matrix[endrow][j]+" ");
            }

            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(matrix[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }
    public static int diag(int matrix[][]) {
        int sum=0;
        // for O(n^2)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;
        
        //for O(n)
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i)
                sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11},
                        {13,14,15}};
        System.out.println(diag(matrix));
    }
}
