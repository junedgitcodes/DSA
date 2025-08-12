package org.example.Scaler.subarray;

public class SubArray1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        for (int s = 0; s < arr.length; s++) {
            for (int e = s; e < arr.length; e++) {
                for (int i = s; i <= e; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }
}
