package org.example.Scaler.Day9.Class;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] A = {-1, -5, 3, 5, -10, 4};
        System.out.println(nobelIntegers(A));
    }

    public static int nobelIntegers(int[] A) {
        Arrays.sort(A);
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == i) {
                ans++;
            }
        }
        return ans;
    }
}
