package org.example.Scaler.Day25.Class;

import java.util.HashSet;
import java.util.Set;

public class SubEqualToZero {
    public static void main(String[] args) {
        int[] A = {2, 2, 1, 4, 3, 1, 2, -2, -3, 2};
        System.out.println(solve(A));
    }

    public static boolean solve(int[] A) {
        Set<Integer> set = new HashSet<>();
        int[] pf = prefixSum(A);
        for (int el : pf) {
            if (el == 0) {
                return true;
            }
            set.add(el);
        }
        if (pf.length != set.size()) {
            return true;
        }
        return false;
    }

    public static int[] prefixSum(int[] A) {
        int[] pf = new int[A.length];
        pf[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            pf[i] = pf[i - 1] + A[i];
        }
        return pf;
    }
}
