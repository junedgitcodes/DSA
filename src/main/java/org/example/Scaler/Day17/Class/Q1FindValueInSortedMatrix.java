package org.example.Scaler.Day17.Class;

public class Q1FindValueInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{-5, -2, 1, 13}, {-4, 0, 3, 14}, {-3, 2, 6, 18}};
        int k = 18;
        boolean result = search(arr, k);
        System.out.println(k + " --> " + result);
    }

    public static boolean search(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (A[i][j] == B) {
                return true;
            } else if (A[i][j] < B) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
