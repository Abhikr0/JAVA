public class q1 {
    public static void main(String[] args) {
            int matrix[][]={{1,2,3},
                            {7,6,7},
                            {9,10,11},
                            {13,14,15}};

        int counter=0;
        int key=7;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
