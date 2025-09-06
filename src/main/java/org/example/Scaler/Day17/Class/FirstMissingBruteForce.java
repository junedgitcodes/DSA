package org.example.Scaler.Day17.Class;

public class FirstMissingBruteForce {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4,1};
        int result = solution(arr);
        System.out.println("result = " + result);
    }

    public static int solution(int[] A) {
        int n = A.length;
        for (int i = 1; i <= n + 1; i++) {
            boolean isFound = false;
            for (int j = 0; j < n; j++) {
                if (A[j] == i) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return i;
            }
        }
        return -1;
    }
}
