package org.example.Scaler.Day22.Assignments;

import java.util.ArrayList;
import java.util.List;

public class AllIndicesOfArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1, -1};
        int[] result = allIndices(A, 1);
        for (int k : result) {
            System.out.print(k + " ");
        }
    }

    public static int[] allIndices(int[] A, int B) {
        List<Integer> ans = new ArrayList<>();
        helper(A, B, 0, ans);
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
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
