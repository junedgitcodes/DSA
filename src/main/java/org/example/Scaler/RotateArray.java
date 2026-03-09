package org.example.Scaler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RotateArray {

    public static void main(String[] args) {
        int[] A = {1, 2, 9, 4, 3};
        int B = 10;
        int[] res
                = target(A, B);
        for (int el : res) {
            System.out.println(el + " ");
        }

    }

    static int[] target(int[] A, int B) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int leftValue = B - A[i];

            if (map.containsKey(leftValue)) {
                return new int[]{i, map.get(leftValue)};
            }
            map.put(A[i],i);
        }
        return new int[]{-1, -1};
    }


}


