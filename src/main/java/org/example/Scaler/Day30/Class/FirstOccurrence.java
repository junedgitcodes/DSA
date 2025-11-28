package org.example.Scaler.Day30.Class;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] A = {-5, -5, -3, 0, 0, 1, 1, 5, 5, 5, 5, 5, 5, 5, 10, 10, 15, 15};
        System.out.println(binarySearch(A, 5));
    }

    public static int binarySearch(int[] A, int target) {
        int ans = -1;
        int s = 0;
        int e = A.length - 1;
        while (s <= e) {
            int midIdx = s + (e - s) / 2;
            int mid = A[midIdx];
            if (mid > target) {
                e = midIdx - 1;
            } else if (mid < target) {
                s = midIdx + 1;
            } else {
                ans = midIdx;
                e = midIdx - 1;
            }
        }
        return ans;
    }
}
