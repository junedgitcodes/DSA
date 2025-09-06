package org.example.Scaler.Day16.Assignments;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedOverlappingIntervals {
    public static void main(String[] args) {
        int[][] A = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = solution(A);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] A) {
        List<int[]> ans = new ArrayList<>();
        int a1, b1, a2, b2;

        a1 = A[0][0];//1
        b1 = A[0][1];//3

        for (int i = 1; i < A.length; i++) {
            a2 = A[i][0];//2
            b2 = A[i][1];//6

            if (a2 > b1) {
                ans.add(new int[]{a1, b1});
                a1 = a2;
                b1 = b2;
            } else {
                b1 = Math.max(b1, b2);
            }
        }
        ans.add(new int[]{a1, b1});
        return ans.toArray(new int[ans.size()][]);
    }
}
