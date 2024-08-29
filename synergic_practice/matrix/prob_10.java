class prob_10 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};

        int row = a.length;
        int col = a[0].length;

        for(int i = 0; i< row; i++){
            int row_sum = 0;
            for(int j = 0; j < col; j++) {
                row_sum += a[i][j];
            }
            System.out.println("The sum of " + (i+1) + " is: " + row_sum);
        }

        for(int i = 0; i< row; i++){
            int col_sum = 0;
            for(int j = 0; j < col; j++) {
                col_sum += a[j][i];
            }
            System.out.println("The sum of " + (i+1) + " is: " + col_sum);
        }
    }    
}