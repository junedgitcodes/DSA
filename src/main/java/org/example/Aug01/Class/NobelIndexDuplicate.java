package org.example.Aug01.Class;

import java.util.Arrays;

public class NobelIndexDuplicate {

    public static void main(String[] args) {
        int[] arr = {-10, 1, 1, 2, 4, 4, 4, 8, 10};
        Arrays.sort(arr);

        int ans = 0;
        int count = 0;
        if (arr[0] == 0) {
            ans++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count = i;
            }
            if (arr[i] == count) {
                ans++;
            }
        }
        System.out.println("ans = " + ans);
    }
}
