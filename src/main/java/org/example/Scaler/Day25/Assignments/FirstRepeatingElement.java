package org.example.Scaler.Day25.Assignments;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] A = {4, 3, 3, 2, 5, 6, 5};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                int freq = map.get(A[i]);
                map.put(A[i], freq + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) == 2) {
                return A[i];
            }
        }
        return -1;
    }
}
