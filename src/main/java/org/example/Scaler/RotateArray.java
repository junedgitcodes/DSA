package org.example.Scaler;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
//        int[] result = rotate(arr, arr.length, k);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println("result[i] = " + result[i]);
//        }
//
        int[] result2 = optimizeRotate(arr, arr.length, k);
        for (int i = 0; i < result2.length; i++) {
            System.out.println("result[i] = " + result2[i]);
        }
    }

    static int[] rotate(int[] arr, int N, int k) {

        int i, temp;
        for (int j = 1; j <= k; j++) {
            temp = arr[N - 1];
            for (i = N - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        return arr;
    }

    static int[] optimizeRotate(int[] arr, int N, int k) {

        Arraysss arraysss = new Arraysss();
        Arraysss.reverse(arr, N, 0, N - 1);
        Arraysss.reverse(arr, N, 0, k - 1);
        Arraysss.reverse(arr, N, k, N - 1);
        return arr;
    }
}


