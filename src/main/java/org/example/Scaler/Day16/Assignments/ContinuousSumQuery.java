package org.example.Scaler.Day16.Assignments;

public class ContinuousSumQuery {
    public static void main(String[] args) {

int A = 5; //array length
        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] result = solution(A, B);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
    }

    public static int[] solution(int A, int[][] B) {
        int[] result = new int[A];
        int s_idx, e_idx, val;
        int N = A;
        int Q = B.length;

        for (int i = 0; i < Q; i++) {
            s_idx = B[i][0] - 1;
            e_idx = B[i][1] - 1;
            val = B[i][2];

            result[s_idx] += val;
            if (e_idx + 1 < A) {
                result[e_idx + 1] -= val;
            }
        }
        for (int i = 1; i < N; i++) {
            result[i] = result[i - 1] + result[i];
        }
        return result;
    }
}
