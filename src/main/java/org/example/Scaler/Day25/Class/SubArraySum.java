package org.example.Scaler.Day25.Class;

import java.util.HashSet;
import java.util.Set;

public class SubArraySum {
    public static void main(String[] args) {
        int[] A = {2, 3, 9, -4, 0, 6, 6, 2, 5};
        System.out.println(solve(A, 11));
    }

    public static boolean solve(int[] A, int k) {
        Set<Integer> set = new HashSet<>();
        int a = 0;
        for (int i = 0; i < A.length; i++) {
            a += A[i];
            if (a == k) {
                return true;
            }
            if (set.contains(a - k)) {
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
