package org.example.Scaler.Day12.Assignments;

public class Isalnum {
    public static void main(String[] args) {
        char[] A = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '*', '0'};
        int result = solution(A);
        System.out.println("result = " + result);
    }

    public static int solution(char[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] >= 65 && A[i] <= 90) || (A[i] >= 97 && A[i] <= 122) || (A[i] >= 48 && A[i] <= 57)) {
                result = 1;

            } else {
                return 0;
            }
        }
        return result;
    }
}
