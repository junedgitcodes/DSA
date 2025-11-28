package org.example.Scaler.Day3.Additional;

public class Q4CountOfElements {
    public static void main(String[] args) {
        int[] A = {5, 5, 3};
        System.out.println(solve(A));

    }

    public static int solve(int[] A) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int num : A){
            max = Math.max(max,num);
        }
        for (int num : A) {

            if (max > num) {
                count++;
            }
        }
        return count;
    }

}
