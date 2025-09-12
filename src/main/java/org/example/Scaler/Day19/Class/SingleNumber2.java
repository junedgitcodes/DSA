package org.example.Scaler.Day19.Class;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 3, 6, 2};
        int result = solve(arr);
        System.out.println("result = " + result);
    }

    public static int solve(int[] A) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int ones = 0;
            for (int j = 0; j < A.length; j++) {
                if ((A[j] & (1 << i)) != 0) {
                    ones++;
                }
            }
            if (ones % 2 != 0) {   // if odd, this bit belongs to the unique number
                ans |= (1 << i);
            }
        }
        return ans;
    }

}
