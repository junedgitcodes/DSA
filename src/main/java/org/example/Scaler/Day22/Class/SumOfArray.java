package org.example.Scaler.Day22.Class;

public class SumOfArray {
    public static void main(String[] args) {
        int[] A = {1,2,5};
        System.out.println(findSum(A,0));
    }

    public static int findSum(int[] A, int idx){
        if(idx==A.length-1){
            return A[idx];
        }
        int fa = A[idx]+findSum(A,idx+1);
        return fa;

    }
}
