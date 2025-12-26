package org.example.Scaler.Day9.Class;

import java.util.Arrays;

public class NobelIndexDuplicate {

    public static void main(String[] args) {
        int[] A = {-10, 1, 1, 2, 4, 4, 4, 8, 10};
        System.out.println(duplicateNobelInteger(A));
    }

    public static int duplicateNobelInteger(int[] A) {
        int ans = 0;
        int count = 0;
        if (A[0] == 0) {
            ans++;
        }
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                count = i;
            }
            if (A[i] == count) {
                ans++;
            }
        }
        return ans;
    }
}
