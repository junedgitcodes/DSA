//package org.example.Scaler.Day7.Assignment;
//
//public class Q1ClosestMinMax {
//    public static void main(String[] args) {
//        int[] A = {2, 6, 1, 6, 9};
//        System.out.println(solve(A));
//    }
//
//    public static int solve(int[] A) {
//        //find min and max
//        // iterate over array and find differeence between them
//        // update the globla answer
//        int max = max(A);
//        int min = min(A);
//        int globalValue = Integer.MAX_VALUE;
//        for (int i = 0; i < A.length; i++) {
//            if(A[i]==max){
//                int maxIdx = i;
//            }
//            if(A[i]==min){
//                int minIdx = i;
//            }
//            int dif
//        }
//
//
//    }
//
//    public static int max(int[] A) {
//        int max = Integer.MIN_VALUE;
//        for (int i : A) {
//            max = Math.max(i, max);
//        }
//        return max;
//    }
//
//    public static int min(int[] A) {
//        int min = Integer.MAX_VALUE;
//        for (int i : A) {
//            min = Math.min(min, i);
//        }
//        return min;
//    }
//}
