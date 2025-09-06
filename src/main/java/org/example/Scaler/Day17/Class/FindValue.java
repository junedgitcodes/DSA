package org.example.Scaler.Day17.Class;

public class FindValue {
    public static void main(String[] args) {
        int[][] arr = {{-5, -2, 1, 13}, {-4, 0, 3, 14}, {-3, 2, 6, 18}};
        int k = -5;
        boolean result = search(arr, k);
        System.out.println(k + " --> " + result);
    }

    public static boolean search(int[][] mat, int k) {

        int n = mat.length;
        int m = mat[0].length;
        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (mat[i][j] == k) {
                return true;
            } else if (mat[i][j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
