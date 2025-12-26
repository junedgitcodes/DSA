package org.example.Scaler.Aug08LabSessionOn2DMatrix;

public class Q4PrintDiagonal {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        principalDiagonal(mat);
        nonPrincipalDiagonal(mat);
    }

    public static void principalDiagonal(int[][] A) {
        int row = 0;
        int col = 0;
        int n = A.length;
        while (row < n) {
            System.out.print(A[row][col] + " ");
            col++;
            row++;
        }
        System.out.println();
    }

    public static void nonPrincipalDiagonal(int[][] A) {
        int row = 0;
        int col = A.length - 1;
        int n = A.length;

        while (row < n) {
            System.out.print(A[row][col] + " ");
            row++;
            col--;
        }
        System.out.println();
    }
}
