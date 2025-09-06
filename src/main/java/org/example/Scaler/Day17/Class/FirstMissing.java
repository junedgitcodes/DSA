package org.example.Scaler.Day17.Class;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FirstMissing {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        int result = solution(arr);
        System.out.println("result = " + result);
    }

    public static int solution(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] < 1 || A[i] > A.length) {
                i++;
                continue;
            }
            int correctIdx = A[i] - 1;
            if (A[i] == A[correctIdx]) {
                i++;
                continue;
            }
            int temp = A[i];
            A[i] = A[correctIdx];
            A[correctIdx] = temp;
        }
        for (int k = 0; k < A.length; k++) {
            if (A[k] != k + 1) {
                return k+1;
            }
        }
        return A.length + 1;
    }
}
