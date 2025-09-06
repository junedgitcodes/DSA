package org.example.Scaler.Day2.Class;

public class ReverseBrutForce {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] result = solution(arr, arr.length, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] solution(int[] arr, int N, int K) {
        int[] result = new int[arr.length];
        for (int i = 0; i < K; i++) {
            int temp = arr[N - 1];
            for (int j = 1; j < N; j++) {
                result[j] = arr[j - 1];
            }
            result[0] = temp;
        }
        return result;
    }
}
