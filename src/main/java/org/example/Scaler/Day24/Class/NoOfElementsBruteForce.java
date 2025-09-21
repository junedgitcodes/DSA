package org.example.Scaler.Day24.Class;

public class NoOfElementsBruteForce {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 2, 3, 1, 3, 1, 3,};
        int[] Q = {1, 2, 3, 4};
        solve(A,Q);
    }

    public static void solve(int[] A, int[] Q) {
        for (int i = 0; i < Q.length; i++) {
            int cnt = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] == Q[i]) {
                    cnt++;
                }
            }
            System.out.println(Q[i] + " "+cnt);
        }
    }
}
