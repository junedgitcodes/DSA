package org.example.Scaler;

public class Arraysss {

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 5};
        int n = arr.length;
//        reverse(arr);
        int s = 1;
        int e = 3;
        reverse(arr, arr.length, s, e);

        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    static void reverse(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - 1 - i] = temp;
        }
    }

     public static void reverse(int arr[], int N, int s, int e) {
        int temp;
        int i = s;
        int j = e;
        while (i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
