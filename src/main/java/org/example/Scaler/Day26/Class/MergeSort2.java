package org.example.Scaler.Day26.Class;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] A = {2, 1, 8, 14, 15};
        solve(A, 0, A.length - 1);

        for (int el : A) {
            System.out.print(el + " ");
        }
    }

    public static void solve(int[] A, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + ((e - s) / 2);

        solve(A, s, mid);
        solve(A, mid + 1, e);
        merge(A, s, mid, e);

    }

    public static void merge(int[] A, int s, int mid, int end) {
        int i = s;
        int j = mid + 1;
        int idx = s;
        int maxVal = getMax(A) + 1;
        while (i <= mid && j <= end) {
            int lv = A[i] % maxVal;
            int rv = A[j] % maxVal;
            if (lv <=rv) {
                A[idx] = A[idx] + (lv * maxVal);
                i++;
            } else {
                A[idx] = A[idx] + (rv * maxVal);
                j++;
            }
            idx++;
        }
        while (i <= mid) {
            int lv = A[i] % maxVal;
            A[idx] = A[idx] + (lv * maxVal);
            idx++;
            i++;
        }
        while (j <= end) {
            int rv = A[j] % maxVal;
            A[idx] = A[idx] + (rv * maxVal);
            idx++;
            j++;
        }

        for (int k = s; k <= end; k++) {
            A[k] = A[k] / maxVal;
        }

    }

    public static int getMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int el : A) {
            max = Math.max(max, el);
        }
        return max;
    }
}
