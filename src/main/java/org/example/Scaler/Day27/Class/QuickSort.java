package org.example.Scaler.Day27.Class;

public class QuickSort {
    public static void main(String[] args) {
        int[] A = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        solve(A, 0, A.length - 1);
        for (int el : A) {
            System.out.print(el + " ");
        }
    }

    public static void solve(int[] A, int s, int e) {
        if (s >= e) {
            return;
        }
        int pivotIdx = pivotIdx(A, s, e);
        solve(A, s, pivotIdx - 1);
        solve(A, pivotIdx + 1, e);

    }

    public static int pivotIdx(int[] A, int s, int e) {
        int pivotValue = A[s];
        int l = s + 1;
        int r = e;
        while (l <= r) {
            if (A[l] <= pivotValue) {
                l++;
            } else if (A[r] > pivotValue) {
                r--;
            } else {
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;
            }
        }
        int temp = A[s];
        A[s] = A[r];
        A[r] = temp;
        return r;
    }


}
