package org.example.Scaler.Day2.Class;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5};
        int[] result = solution(arr, arr.length,0,arr.length-1);
        for(int i =0 ;i<result.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] solution(int[] arr, int N, int s, int e) {
        int i = s;
        int j = e;
        while (i <= j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }

        return arr;
    }
}
