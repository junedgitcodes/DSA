package org.example.Scaler.Day27.Class;

public class Pivot {
    public static void main(String[] args) {
        int[] A = {54, 26, 93, 17, 77, 31, 44, 55, 20};


        int result = solve(A, 0, A.length - 1);

        System.out.println(result);
    }

    public static int solve(int[] A, int s, int e) {
        int pivotIdx = A[s];
        int l = s + 1;
        int r = e;
        while (l <= r) {
            if (A[l] <= pivotIdx) {
                l++;
            } else if (A[r] > pivotIdx) {
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
