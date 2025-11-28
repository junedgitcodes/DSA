package org.example.Scaler.Day3.Additional;

public class Q2SecondLargest {
    public static void main(String[] args) {
        int[] A = {20,20};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        if (A.length == 1) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int num : A) {
            if (num > max) {
                secMax = max;
                max = num;
            } else if (num > secMax && num != max) {
                secMax = num;
            }
        }
        if(secMax == Integer.MIN_VALUE){
            return -1;
        }
        return secMax;
    }
}
