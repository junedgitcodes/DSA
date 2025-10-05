package org.example.Scaler.Day26.Assignments;

public class Q2SortByColor {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 1, 0, 2};
        int[] C = sortColors(A);
        for (int el : C) {
            System.out.print(el + " ");
        }
    }

    public static int[] sortColors(int[] A) {
        int max = getMax(A);
        int[] freq = new int[max + 1];
        for (int el : A) {
            freq[el]++;
        }

        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            int f = freq[i];
            for (int n = 0; n < f; n++) {
                A[idx] = i;
                idx++;
            }
        }
        return A;
    }

    public static int getMax(int[] A) {
        int max = 0;
        for (int el : A) {
            max = Math.max(max, el);
        }
        return max;
    }
}
