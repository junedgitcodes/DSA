package org.example.Scaler.Day24.Class;

import java.util.HashMap;
import java.util.Map;

public class NoOfElements2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 2, 3, 1, 3, 1, 3,};
        int[] Q = {1, 2, 3, 4};
        solve(A, Q);
    }

    public static void solve(int[] A, int[] Q) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int el : A) {
            if (map.containsKey(el)) {
                int freq = map.get(el);
                freq++;
                map.put(el, freq);

            } else {
                map.put(el, 1);
            }
        }
        for (int el : Q) {
            if (map.containsKey(el)) {
                System.out.println(el + " " + map.get(el));
            } else {
                System.out.println(el + " " + 0);
            }
        }
    }
}
