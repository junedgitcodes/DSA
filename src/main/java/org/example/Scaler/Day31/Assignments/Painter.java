package org.example.Scaler.Day31.Assignments;

public class Painter {
    static final int MOD = 10000003;

    public static void main(String[] args) {

        int A = 1;
        int B = 1000000;
        int[] C = {1000000, 1000000};
        System.out.println(paint(A, B, C));
    }
    //A--> Painter B--> unit of time to do 1 unit of work  C--> Length

    public static int paint(int A, int B, int[] C) {
        long s = getMaxOfArray(C);
        long e = sumOfArray(C);
        long ans = 0;
        while (s <= e) {
            long mid = s + ((e - s) / 2);
            boolean isPossible = canPaint(A, C, mid);
            if (isPossible) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        long result = (ans % MOD * B % MOD) % MOD;
        return (int) result;
    }

    public static boolean canPaint(int A, int[] C, long mid) {
        int sum = 0;
        int noOfPainters = 1;
        for (int el : C) {
            sum += (el);
            if (sum > mid) {
                noOfPainters++;
                sum = el;
            }
        }
        if (noOfPainters > A) {
            return false;
        }
        return true;
    }

    public static int getMaxOfArray(int[] A) {
        int result = -1;
        for (int el : A) {
            result = Math.max(result, el);
        }
        return result;
    }

    public static int sumOfArray(int[] A) {
        int sum = 0;
        for (int el : A) {
            sum += el;
        }
        return sum;
    }
}
