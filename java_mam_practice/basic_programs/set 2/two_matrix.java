import java.util.*;

class matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // initializing two matrix
        int[][] A = new int[size][size];
        int[][] B = new int[size][size];
        //result matrix
        int[][] C = new int[size][size];
        
        // input for first matrix
        System.out.println("Enter input for first matrix: ");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                A[i][j] = sc.nextInt();
            }
        }

        // input for second matrix
        System.out.println("Enter input for second matrix: ");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                B[i][j] = sc.nextInt();
            }
        }

        // addition of two matrices
        System.out.println("output: ");
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size ; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}