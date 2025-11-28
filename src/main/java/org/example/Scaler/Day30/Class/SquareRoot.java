package org.example.Scaler.Day30.Class;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(126));
    }

    public static int sqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int ans = -1;
        int s = 1;
        int e = n;
        while (s <= e) {
            int mid = s + ((e - s) / 2);
            if (mid * mid < n) {
                ans = mid;
                s = mid + 1;
            } else if (mid * mid > n) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return ans;
    }
}
