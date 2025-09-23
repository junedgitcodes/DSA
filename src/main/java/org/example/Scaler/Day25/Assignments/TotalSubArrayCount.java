package org.example.Scaler.Day25.Assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TotalSubArrayCount {
    public static void main(String[] args) {
        int[] A = {-14,
                -9, 12, 7, -12, -4, 7, 25, -5, 48, 33, -49, 36, -31, -48, 36, 36, 17, 13, -47,
                -39, 37, -20, 35, 38, 26, -40, -43, 36, -48, -33, -30, 6, -28, 11, 27,
                22, 18, -21, -11, -50, 34, -21, 44, -25, 17, 34, -12, 14, 26, 30};

        System.out.println(solve(A, 15));
    }

    public static int solve(int[] A, int B) {
//        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (map.containsKey(sum - B)) {
                count += map.get(sum - B);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
