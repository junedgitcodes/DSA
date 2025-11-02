package org.example.Scaler.Day27.Assignments;

public class PartitionIndex {
    public static void main(String[] args) {
        int[] A = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        System.out.println(partition(A));

    }

    public static int partition(int[] A) {

        return solve(A, 0, A.length - 1);
    }

    public static int solve(int[] A, int s, int e) {
        int pivotValue = A[s];
        int l = s + 1;
        int r = e;
        while (l <= r) {
            if (A[l] <= pivotValue) {
                l++;
            } else if (A[r] >= pivotValue) {
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
