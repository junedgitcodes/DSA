package org.example.Scaler.Day16.Assignments;

public class MaxSumContiguousSubArray {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, -10};
        int result = solution(A);
        System.out.println("result = " + result);

    }

    public static int solution(int[] A) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for (int element : A) {
            sum += element;
            ans = Math.max(sum, ans);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;

    }
}
