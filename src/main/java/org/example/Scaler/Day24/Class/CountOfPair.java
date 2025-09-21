package org.example.Scaler.Day24.Class;

import java.util.HashMap;
import java.util.Map;

public class CountOfPair {
    public static void main(String[] args) {
        int[] A = {2, 5, 2, 5, 8, 5, 2, 8};
        int B = 10;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            int target = B - A[i];
            if (map.containsKey(target)) {
                cnt += map.get(target);
            }
            if (map.containsKey(A[i])) {
                int freq = map.get(A[i]);
                map.put(A[i], freq + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        return cnt;
    }
}
