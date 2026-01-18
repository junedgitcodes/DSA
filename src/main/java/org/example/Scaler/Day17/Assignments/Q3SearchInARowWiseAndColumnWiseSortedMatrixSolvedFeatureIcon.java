package org.example.Scaler.Day17.Assignments;

public class Q3SearchInARowWiseAndColumnWiseSortedMatrixSolvedFeatureIcon {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 2;
        int result = solve(arr, k);
        System.out.println(k + " --> " + result);
    }

    public static int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int i = 0;
        int j = m - 1;
        int ans = Integer.MAX_VALUE;
        while (i < n && j >= 0) {
            if (A[i][j] == B) {
                int k = (i+1) * 1009 + (j+1);
                ans = Math.min(k, ans);
                j--;
            } else if (A[i][j] < B) {
                i++;
            } else {
                j--;
            }
        }
        return ans == Integer.MAX_VALUE?-1:ans;
    }
}
