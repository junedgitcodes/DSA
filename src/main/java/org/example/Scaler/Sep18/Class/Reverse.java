package org.example.Scaler.Sep18.Class;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 4, 1, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int[] result = solution(arr, arr.length, 0, (arr.length - 1));
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    public static int[] solution(int[] arr, int N, int s, int e) {
        int i = s;
        int j = e;
        int temp;
        while (i <= j) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
