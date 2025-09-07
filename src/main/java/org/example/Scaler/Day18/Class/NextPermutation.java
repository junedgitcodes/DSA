package org.example.Scaler.Day18.Class;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6, 5, 4, 0};
        int[] result = solution(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] solution(int[] A) {
        int n = A.length;
        if (A.length == 1) {
            return A;
        }
        int pivotIdx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] >= A[i + 1]) {
                continue;
            }
            pivotIdx = i;
            break;
        }
        if (pivotIdx == -1) {
            reverseArray(A, 0, n - 1);
            return A;
        }
        int swapIdx = -1;
        for (int i = n - 1; i >= pivotIdx; i--) {
            if (A[i] > A[pivotIdx]) {
                swapIdx = i;
                break;
            }
        }
        swap(A, pivotIdx, swapIdx);
        reverseArray(A, pivotIdx + 1, n - 1);
        return A;
    }

    public static int[] reverseArray(int[] A, int s, int e) {
        int i = s;
        int j = e;
        int temp = 0;
        while (i < j) {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }

    public static int[] swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
        return A;
    }
}
