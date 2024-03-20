class Rajnish_pattern{
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<5;i++){
            //R
            for(int j=0;j<5;j++){
                if(i == 0||j == 0||i == n/2||(j == n-1 && i <n/2)||(i >= n/2 && i == j))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            //A
            for (int j=0;j<5;j++)
            {
                if(i==0||j==0||j==n-1||i==n/2){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //J
            for(int j=0;j<5;j++)
            {
                if(i == 0 || j == 2 || (i == 4 && i-j >= n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //N
            for (int j=0;j<5;j++){
                if(j == 0|| j == 4 || i == j)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //I
            for (int j=0;j<5;j++){
                if(i == 0|| i == 4 || j == 2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //S
            for (int j=0;j<5;j++){
                if(i == 0 || i == 4 || i == 2 || (j == 0 && (i+j<=n/2)) || (j == 4 && (j - i <= n/2)))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //H
            for(int j=-0;j<5;j++){
            if(j == 0 || j == 4 || i == 2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}