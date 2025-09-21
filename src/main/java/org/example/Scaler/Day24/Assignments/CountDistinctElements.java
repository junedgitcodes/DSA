package org.example.Scaler.Day24.Assignments;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] A = {3, 5, 6, 5, 4};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int el : A) {
            set.add(el);
        }
        return set.size();
    }
}
