package org.example.Scaler.Day22.Class;

import java.util.ArrayList;
import java.util.List;

public class findTarget {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1};
        List<Integer> result = findB(A, 1);
        for (int idx : result) {
            System.out.println(idx);
        }
    }

    public static List<Integer> findB(int[] A, int B) {
        List<Integer> ans = new ArrayList<>();
        helper(A, B, 0, ans);
        return ans;
    }

    public static void helper(int[] A, int B, int idx, List<Integer> result) {
        if (idx == A.length) {
            return;
        }
        if (A[idx] == B) {
            result.add(idx);
        }
        helper(A, B, idx + 1, result);
    }

}

