package org.example.Scaler.Day30.Assignments;

public class Q1SearchForRange {
    public static void main(String[] args) {
        int[] A = {5, 7, 7, 8, 8, 10};
        int[] result = searchRange(A, 8);
        for (int el : result) {
            System.out.print(el + " ");
        }
    }

    public static int[] searchRange(int[] A, int B) {
        int[] result = new int[2];
        result[0] = firstOccurrence(A, B);
        result[1] = lastOccurrence(A, B);
        return result;
    }

    public static int firstOccurrence(int[] A, int B) {
        int ans = -1;
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
                ans = midIdx;
                e = midIdx - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] A, int B) {
        int ans = -1;
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
                ans = midIdx;
                s = midIdx + 1;
            }
        }
        return ans;
    }
}
