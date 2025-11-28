package org.example.Scaler.Day30.Assignments;

public class Q3SortedInsertPosition {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6};
        System.out.println(searchInsert(A, 7));
    }

    public static int searchInsert(int[] A, int B) {
        int n = A.length;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int midIdx = s + ((e - s) / 2);
            int mid = A[midIdx];
            if (mid > B) {
                e = midIdx - 1;
            } else if (mid < B) {
                s = midIdx + 1;
            } else {
                return midIdx;
            }
        }
        return s;
    }
}
