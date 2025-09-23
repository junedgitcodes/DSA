package org.example.Scaler.Day25.Assignments;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWith0sum {
    public static void main(String[] args) {
        int[] A = {1, 2, -3, 1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        Set<Integer> set = new HashSet<>();
        int[] pf = prefixSum(A);
        for (int el : pf) {
            if (el == 0) {
                return 1;
            }
            set.add(el);
        }
        if (A.length != set.size()) {
            return 1;
        }
        return 0;
    }

    public static int[] prefixSum(int[] A) {
        int[] pf = new int[A.length];
        pf[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            pf[i] = pf[i - 1] + A[i];
        }
        return pf;
    }

    //Set<Integer> set = new HashSet<>();
    //   set.add(0);

    //int sum = 0;
    //   for (int num : A) {
    //       sum += num;
    //       if (set.contains(sum)) {
    //           return 1;
    //       }
    //       set.add(sum);
    //   }

    //return 0;
}
