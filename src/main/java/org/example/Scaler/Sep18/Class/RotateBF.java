package org.example.Scaler.Sep18.Class;

public class RotateBF {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 4, 5, 6, 1};
        int[] result = solution(arr, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] solution(int[] arr, int k) {
        int temp;
        int N = arr.length;
        k = k % N;
        for (int rot = 0; rot < k; rot++) {
            temp = arr[N - 1];
            for (int i = N - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        return arr;
    }
}
