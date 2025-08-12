package org.example.Scaler.July30.SubArrayTotalSum;

public class Idea2 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5};
        int result = subArrayTotal(arr);
        System.out.println("result = " + result);
    }
//3,5,10
    //3+5+10+2+7+5=32
    public static int subArrayTotal(int[] arr) {
        int result = 0;
        int N = arr.length;
        int[] pSum = pSum(arr, N);
        for (int s = 0; s < N; s++) {
            for (int e = s; e < N; e++) {
                int sum;
                if (s == 0) {
                    sum = pSum[e];
                } else {
                    sum = pSum[e] - pSum[s - 1];
                }
                result += sum;
            }
        }
        return result;
    }

    private static int[] pSum(int[] arr, int N) {
        int[] pSum = new int[arr.length];
        pSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }
        return pSum;
    }
}
