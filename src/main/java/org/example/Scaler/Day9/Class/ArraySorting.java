package org.example.Scaler.Day9.Class;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {-1, -5, 3, 5, -10, 4};
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
