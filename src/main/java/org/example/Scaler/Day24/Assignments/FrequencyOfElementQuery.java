package org.example.Scaler.Day24.Assignments;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementQuery {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 2, 3, 1, 3, 1, 3,};
        int[] Q = {1, 2, 3, 4};
        int[] result = solve(A, Q);
        for (int el : result) {
            System.out.println(el);
        }
    }

    public static int[] solve(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[B.length];
        for (int el : A) {
            if (map.containsKey(el)) {
                int freq = map.get(el);
                freq++;
                map.put(el, freq);
            } else {
                map.put(el, 1);
            }
        }

            for (int i = 0; i < B.length; i++) {
                result[i] = map.getOrDefault(B[i], 0);
            }

        return result;
    }
}
