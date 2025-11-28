package org.example.Scaler.Day30.Assignments;

public class Q2SquareRootOfInteger {
    public static void main(String[] args) {
        System.out.println(sqrt(2147483647));
    }

    public static int sqrt(int A) {
        int ans = -1;
        if (A == 0 || A == 1) {
            return A;
        }
        int s = 1;
        int e = A;

        while (s <= e) {
            int mid = s + ((e - s) / 2);
            long square = (long)mid * mid;
            if (square < A) {
                ans = mid;
                s = mid + 1;
            } else if (square > A) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return ans;
    }
}
