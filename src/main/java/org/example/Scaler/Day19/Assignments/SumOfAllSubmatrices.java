package org.example.Scaler.Day19.Assignments;

public class SumOfAllSubmatrices {
    public static void main(String[] args) {
        int[][] arr = {{1, 1}, {1, 1}};
        int result = sumOfSubMatrices(arr);
        System.out.println(result);
    }

    public static int sumOfSubMatrices(int[][] A) {

        int n = A.length;
        int m = A[0].length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int start = (i + 1) * (j + 1);
                int end = (n - i) * (m - j);
                int occ = start * end;
                total += A[i][j] * occ;
            }
        }
        return total;
    }
}
