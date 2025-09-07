package org.example.Scaler.Day18.Class;

public class BoundaryPrint {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        solution(arr);
    }

    public static void solution(int[][] A) {
        int i = 0;
        int j = 0;
        int n = A.length;
        for (int k = 0; k < n - 1; k++) {
            System.out.print(A[i][j] + " ");
            j++;
        }
        System.out.println();
        System.out.println(i + " " + j);
        System.out.println();
        for (int k = 0; k < n - 1; k++) {
            System.out.print(A[i][j] + " ");
            i++;
        }
        System.out.println();
        System.out.println(i + " " + j);
        System.out.println();
        for (int k = 0; k < n - 1; k++) {
            System.out.print(A[i][j] + " ");
            j--;
        }
        System.out.println();
        System.out.println(i + " " + j);
        System.out.println();
        for (int k = 0; k < n - 1; k++) {
            System.out.print(A[i][j] + " ");
            i--;
        }
    }
}
