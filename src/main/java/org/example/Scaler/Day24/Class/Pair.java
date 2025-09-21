package org.example.Scaler.Day24.Class;

import java.util.HashSet;
import java.util.Set;

public class Pair {
    public static void main(String[] args) {
        int[] A = {8, 9, 2, -2, 4, 5, 11, -6, 4};
        int B = 9;
        System.out.println(solve(A, B));
    }

    public static boolean solve(int[] A, int B) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(B - A[i])) {
                return true;
            } else {
                set.add(A[i]);
            }
        }
        return false;
    }
}
