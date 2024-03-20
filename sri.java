class Srimathi_pattern{
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<5;i++){
            //S
            for(int j=0;j<5;j++){
                if(i == 0 || i == 4 || i == 2 || (j == 0 && (i+j<=n/2)) || (j == 4 && (j - i <= n/2)))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            //R
            for (int j=0;j<5;j++)
            {
                if(i == 0||j == 0||i == n/2||(j == n-1 && i <n/2)||(i >= n/2 && i == j)){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //I
            for(int j=0;j<5;j++)
            {
                if(i == 0|| i == 4 || j == 2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //M
            for (int j=0;j<5;j++){
                if(j == 0 || j == 4 || (( i == j) && (i+j<=2)) || (((j-i)>=0) && (i+j == 4)))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //A
            for (int j=0;j<5;j++){
                if(i==0||j==0||j==n-1||i==n/2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //T
            for (int j=0;j<5;j++){
                if(i == 0 || j == 2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //H
            for(int j=0;j<5;j++){
            if(j == 0 || j == 4 || i == 2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            //I
            for(int j=0; j<5; j++){
                if(i == 0|| i == 4 || j == 2){
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