package hackathon;

import java.util.*;

public class MatrixSubsetChecker {

    // * Function to check if matrix B is a subset of matrix A

    public static boolean isSubset(int[][] A, int[][] B) {
        int N = A.length;
        int M = B.length;
        
        // Check all possible N-M+1 x N-M+1 top-left positions in A
        for (int i = 0; i <= N - M; i++) {
            for (int j = 0; j <= N - M; j++) {
                if (isMatching(A, B, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    // * Function to check if the submatrix starting at (startRow, startCol) matches matrix B

    public static boolean isMatching(int[][] A, int[][] B, int startRow, int startCol) {
        int M = B.length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (A[startRow + i][startCol + j] != B[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // * Function to transpose the matrix

    public static int[][] transpose(int[][] matrix) {
        int N = matrix.length;
        int[][] transposed = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }

    // * Function to rotate the matrix 90 degrees clockwise

    public static int[][] rotateRight(int[][] matrix) {
        int N = matrix.length;
        int[][] rotated = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotated[i][j] = matrix[N - j - 1][i];
            }
        }
        return rotated;
    }

    // * Function to rotate the matrix 90 degrees counterclockwise

    public static int[][] rotateLeft(int[][] matrix) {
        int N = matrix.length;
        int[][] rotated = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotated[i][j] = matrix[j][N - i - 1];
            }
        }
        return rotated;
    }

    // * Function to reverse the matrix

    public static int[][] reverse(int[][] matrix) {
        int N = matrix.length;
        int[][] reversed = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                reversed[i][j] = matrix[N - i - 1][N - j - 1];
            }
        }
        return reversed;
    }

    // * Main function to test the matrix subset checker
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size N of the matrix: ");
        int N = sc.nextInt();

        int[][] A = new int[N][N];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the size M of the second matrix: ");
        int M = sc.nextInt();

        int[][] B = new int[M][M];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Check all transformations of A
        int[][][] transformations = {
            A,
            transpose(A),
            rotateRight(A),
            rotateLeft(A),
            reverse(A)
        };

        boolean found = false;
        for (int[][] transformedMatrix : transformations) {
            if (isSubset(transformedMatrix, B)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "The second matrix is a subset of the first matrix in some form." : "The second matrix is not a subset of the first matrix in any form.");
    }
}