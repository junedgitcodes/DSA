package org.example.Scaler.Day29.Class;

public class BinarySearch {
    public static void main(String[] args) {
        int[] A = {3, 6, 9, 12, 14, 19, 20, 23, 25, 27};
        System.out.println(binarySearch(A, 12));
    }

    public static int binarySearch(int[] A, int target) {
        int s = 0;
        int e = A.length-1;
        while (s <= e) {
            int midIdx = (s + ((e - s) / 2));
            int mid = A[midIdx];
            if (mid > target) {
                e = midIdx - 1;
            } else if (mid < target) {
                s = midIdx + 1;
            } else {
                return midIdx;
            }
        }
        return -1;
    }
}
