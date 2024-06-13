import java.util.Arrays;

class Transpose_matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {0,1,2,3},
            {4,5,6,7},
            {8,9,10,11},
            {12,13,14,15}
        };
        int temp = 0;

        // traverse lower traingle and swap ((i,j) to (j,i))
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<i; j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }    
}