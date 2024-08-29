class prob_12{
    public static void main(String[] args) {
        int[][] a = {{5,0,5}, {0,5,0}, {0,0,5}};

        int row = a.length;
        int col = a[0].length;
        boolean flag = true;

        if(row != col){
            System.out.println("Not possible");
        }
        else{
            int pos = a[0][0];
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    if(((i == j) && (a[i][j] == pos)) || ((i!=j)&&(a[i][j] == 0))){
                    }
                    else{
                        flag = false;
                    }
                }
            }
        }
        System.out.println(flag ? "Identity matrix" : "not an identity matrix");
    }   
}