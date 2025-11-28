package org.example.Scaler.Day31.Class;

public class Painter {
    public static void main(String[] args) {
        int[] A = {3, 5, 1, 7, 8, 2, 5, 3, 10, 1, 4, 7, 5, 4, 6};
        int k = 4;
        System.out.println(painterPartition(A, k));
    }

    public static int painterPartition(int[] A, int k) {
        int s = getMaxOfArray(A);
        int e = sumOfArray(A);
        int ans = 0;
        while (s <= e) {
            int mid = s + ((e - s) / 2);
            boolean isPossible = check(A, k, mid);
            if (isPossible) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static boolean check(int[] A, int k, int mid) {
        int sum = 0;
        int noOfPainter = 1;
        for (int el : A) {
            sum += el;
            if (sum > mid) {
                noOfPainter++;
                sum = el;
            }
        }
        if (noOfPainter > k) {
            return false;
        }
        return true;
    }

    public static int getMaxOfArray(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int el : A) {
            max = Math.max(max, el);
        }
        return max;
    }

    public static int sumOfArray(int[] A) {
        int sum = 0;
        for (int el : A) {
            sum += el;
        }
        return sum;
    }

}
