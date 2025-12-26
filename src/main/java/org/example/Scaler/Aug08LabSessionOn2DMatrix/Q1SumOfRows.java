package org.example.Scaler.Aug08LabSessionOn2DMatrix;

public class Q1SumOfRows {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        rowSum(mat);
    }

    public static void rowSum(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            int row = i+1;
            int sum = 0;
            for (int j = 0; j < A[0].length; j++) {
                sum = sum + A[i][j];
            }
            System.out.println(row + " : " + sum);

        }
    }
}
