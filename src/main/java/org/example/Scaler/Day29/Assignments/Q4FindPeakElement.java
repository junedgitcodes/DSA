package org.example.Scaler.Day29.Assignments;

public class Q4FindPeakElement {
    public static void main(String[] args) {
        int[] A = {1,1000000000,1000000000};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int n = A.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int midIdx = s + ((e - s) / 2);
            int mid = A[midIdx];
            if ((midIdx == 0 || mid > A[midIdx - 1]) && (midIdx == n - 1 || mid > A[midIdx + 1])) {
                return mid;
            } else if ((midIdx == 0 || mid < A[midIdx - 1]) && (midIdx == n - 1 || mid > A[midIdx + 1])) {
                e = midIdx - 1;
            } else {
                s = midIdx + 1;
            }
        }
        return -1;

    }
}
