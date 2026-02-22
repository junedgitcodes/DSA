package org.example.Scaler.Day18.Class;

public class Q4NextPermutation {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 4, 2, 6, 0};//1354602
        solve(A);
        for (int el : A) {
            System.out.print(el + " ");
        }
    }

    public static void solve(int[] A) {
        //1 2 3
        // first if size is 1 just return no need to do anything
        // check for pivoted idx
        // if no change in pivot
        // now check for just greater value than pivotIdx value
        // one found swap it
        // at point i (which is gretter than piviot idx value) reverse everything
        int n = A.length;
        int pivotIdx = -1;
        if (n == 1) {
            return;
        }
        for (int i = n - 1; i > 0; i--) {
            if (A[i] > A[i - 1]) {
                pivotIdx = i-1;
                break;
            }
        }
        if (pivotIdx == -1) {
            reverse(A, 0, n - 1);
            return;
        }
        int swapIdx = -1;
        for (int i = n - 1; i > pivotIdx; i--) {
            if (A[i] > A[pivotIdx]) {
                swapIdx = i;
                break;
            }
        }
        swap(A, pivotIdx, swapIdx);
        reverse(A, pivotIdx+1, n - 1);
    }

    public static void reverse(int[] A, int s, int e) {
        int i = s;
        int j = e;
        while (i <= j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
