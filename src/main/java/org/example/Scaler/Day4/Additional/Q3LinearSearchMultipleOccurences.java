package org.example.Scaler.Day4.Additional;

public class Q3LinearSearchMultipleOccurences {
    public static void main(String[] args) {
        int[] A = {1, 2, 2};
        System.out.println(solve(A, 2));
    }

    public static int solve(int[] A, int B) {
        int count = 0;
        for (int num : A) {
            if (B == num) {
                count++;
            }
        }
        return count;
    }

}
