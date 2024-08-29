import java.util.*;

public class prob_11 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};

        int row = a.length;
        int col = a[0].length;

        int[][] res = new int[row][col];

        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++) {
                res[i][j] = a[j][i];
            }
        }
        
        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}