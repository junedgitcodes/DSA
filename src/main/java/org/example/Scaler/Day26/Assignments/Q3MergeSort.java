package org.example.Scaler.Day26.Assignments;

public class Q3MergeSort {
    public static void main(String[] args) {
        int[] A = {1, 6, 3, 8, 2};
        int[] C = solve(A);
        for (int rl : C) {
            System.out.print(rl + " ");
        }
    }

    public static int[] solve(int[] A) {
        mergeSort(A, 0, A.length-1);
        return A;
    }

    public static void mergeSort(int[] A, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + ((e - s) / 2);
        mergeSort(A, s, mid);
        mergeSort(A, mid + 1, e);
        int[] C = merge(A, s, mid, e);
        for (int i = 0; i < C.length; i++) {
            A[s + i] = C[i];
        }
    }

    public static int[] merge(int[] A, int s, int mid, int e) {
        int[] merged = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int idx = 0;

        while (i <= mid && j <= e) {
            if (A[i] <= A[j]) {
                merged[idx] = A[i];
                idx++;
                i++;
            } else {
                merged[idx++] = A[j++];
            }
        }
        while (i <= mid) {
            merged[idx++] = A[i++];
        }
        while (j <= e) {
            merged[idx++] = A[j++];
        }

        return merged;
    }
}
