package org.example.Scaler.Day18.Class;

public class SprialPrint {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        solution(arr);
    }

    public static void solution(int[][] A) {
        int n = A.length;
        int r = 0;
        int c = 0;
        int loop = n - 1;

        while (loop > 0) {

            int i = r;
            int j = c;
            for (int k = 0; k < loop; k++) {
                System.out.print(A[i][j] + " ");
                j++;
            }
            System.out.println();
            for (int k = 0; k < loop; k++) {
                System.out.print(A[i][j] + " ");
                i++;
            }
            System.out.println();
            for (int k = 0; k < loop; k++) {
                System.out.print(A[i][j] + " ");
                j--;
            }
            System.out.println();
            for (int k = 0; k < loop; k++) {
                System.out.print(A[i][j] + " ");
                i--;
            }
            System.out.println();

            r++;
            c++;
            loop -= 2;

        }
        if (loop == 0) {
            System.out.println(A[r][c]);
        }

    }
}
