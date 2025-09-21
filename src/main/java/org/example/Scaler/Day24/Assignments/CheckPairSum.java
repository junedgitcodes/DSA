package org.example.Scaler.Day24.Assignments;

import java.util.HashSet;
import java.util.Set;

public class CheckPairSum {
    public static void main(String[] args) {
        int[] A = {8, 9, 2, -2, 4, 5, 11, -6, 4};
        int B = 9;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(B - A[i])) {
                return 1;
            } else {
                set.add(A[i]);
            }
        }
        return 0;
    }
}
