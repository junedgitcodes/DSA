package org.example.Scaler.Day18.Assignments;

public class Q1RainWaterTrapped {
    public static void main(String[] args) {
        int[] A = {2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1};
        //lMax{0,2,2,3,}
        //rMax{}
        System.out.println(trap(A));
    }

    public static int trap(final int[] A) {
// create lmax and rmax
// find trap using min(lmax[i], rMAx[i])-A[i];
//        calculate total trap

        int sum = 0;
        int n = A.length;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = 0;
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i - 1], A[i - 1]);
        }
        rMax[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], A[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int water = Math.min(lMax[i], rMax[i]) - A[i];
            if (water > 0) {
                sum += water;
            }
        }

        return sum;
    }
}
