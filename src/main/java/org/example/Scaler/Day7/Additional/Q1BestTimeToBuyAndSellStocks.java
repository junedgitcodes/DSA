package org.example.Scaler.Day7.Additional;

public class Q1BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] A = {4,3,2,1};
        System.out.println(maxProfit(A));
    }

    public static int maxProfit(final int[] A) {
        if (A.length < 2 || A.length == 0 || A ==null) {
            return 0;
        }
        int min = A[0];
        int maxProfit = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            } else {
                int profit = A[i] - min;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
