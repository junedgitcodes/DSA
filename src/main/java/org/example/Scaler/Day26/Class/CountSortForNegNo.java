package org.example.Scaler.Day26.Class;

public class CountSortForNegNo {
    public static void main(String[] args) {
        int[] A = {-2, 3, 4, 2, 7, 2, 1};
        int[] result = solve(A);
        for (int el : result) {
            System.out.print(el + " ");
        }
    }

    public static int[] solve(int[] A) {
        int min = getMin(A);
        int max = getMax(A);

        int[] frq = new int[max - min + 1];

        for (int i = 0; i < A.length; i++) {
            frq[A[i] - min]++;
        }

        int idx = 0;
        for (int i = 0; i < frq.length; i++) {
            int f = frq[i];
            for (int k = 0; k < f; k++) {
                A[idx] = i + min;
                idx++;
            }
        }
        return A;
    }

    public static int getMin(int[] A) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            min = Math.min(min, A[i]);
        }
        return min;
    }

    public static int getMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int el : A) {
            max = Math.max(max, el);
        }
        return max;
    }
}
