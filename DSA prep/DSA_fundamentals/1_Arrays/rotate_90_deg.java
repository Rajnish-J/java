import java.util.Arrays;

class rotate_90_deg {
    public static void main(String[] args) {
        int[][] arr = {
            {0,1,2,3},
            {4,5,6,7},
            {8,9,10,11},
            {12,13,14,15}
        };
        int temp = 0;

        // traverse lower traingle and swap ((i,j) to (j,i)):Transpose
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<i; j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        // row wise rotation
        for(int i = 0; i<arr.length; i++){
            for(int j = arr.length - 1; j>=0; j--){
                System.out.print(arr[i][j] + " ");        
            }
            System.out.println();
        }
    }    
}