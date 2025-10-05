package org.example.Scaler.Day26.Assignments;

public class Q4CountSort {
    public static void main(String[] args) {
        int[] A = {-2, 3, 4, 2, 7, 2, 1};
        int[] result = solve(A);
        for (int el : result) {
            System.out.print(el + " ");
        }
    }

    public static int[] solve(int[] A) {
        int max = getMax(A);
        int min = getMin(A);
        int[] freq = new int[max-min+1];
        for(int el : A){
            freq[el-min]++;
        }
        int idx = 0;
        for(int i =0;i<freq.length;i++){
            int f = freq[i];
            for(int n = 0;n<f;n++){
                A[idx] = i+min;
                idx++;
            }
        }
        return A;

    }

    public static int getMax(int[] A) {
        int max = A[0];
        for (int el : A) {
            max = Math.max(max, el);
        }
        return max;
    }

    public static int getMin(int[] A) {
        int min = A[0];
        for (int el : A) {
            min = Math.min(min, el);
        }
        return min;
    }
}
