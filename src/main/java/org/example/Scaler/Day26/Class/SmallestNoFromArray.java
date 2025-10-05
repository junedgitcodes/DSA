package org.example.Scaler.Day26.Class;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SmallestNoFromArray {
    public static void main(String[] args) {
        int[] A = {6, 3, 4, 2, 7, 2, 1};
        int[] result = solve(A);
        for (int el : result) {
            System.out.print(el + " ");
        }
    }

    public static int[] solve(int[] A) {
        int max = getMax(A);
        int[] freq = new int[max + 1];
        for (int el : A) {
            freq[el]++;
        }

        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            int f = freq[i];
            for (int n = 0; n < f; n++) {
                A[idx] = i;
                idx++;
            }
        }
        return A;
    }

    public static int getMax(int[] A) {
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        int max = 0;
        for (int el : A) {
            max = Math.max(el, max);
        }
        return max;
    }
}
