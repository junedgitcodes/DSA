package org.example.Scaler.Day27.Assignments;

public class Q3QuickSort {
    public static void main(String[] args) {
        int[] A = {1, 4, 10, 2, 1, 5};
        quickSort(A, 0, A.length-1);
        for (int el : A) {
            System.out.print(el+" ");
        }
    }

    public static void quickSort(int[] A, int s, int e) {
        if (s >= e) {
            return;
        }
        int pivotIdx = partitionIdx(A, s, e);
        quickSort(A, s, pivotIdx - 1);
        quickSort(A, pivotIdx + 1, e);
    }

    public static int partitionIdx(int[] A, int s, int e) {
        int pivotIdx = A[s];
        int l = s + 1;
        int r = e;
        while (l <= r) {
            if (A[l] <= pivotIdx) {
                l++;
            } else if (A[r] >= pivotIdx) {
                r--;
            } else {
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;
                l++;
                r--;
            }

        }
        int temp = A[s];
        A[s] = A[r];
        A[r] = temp;
        return r;
    }
}
