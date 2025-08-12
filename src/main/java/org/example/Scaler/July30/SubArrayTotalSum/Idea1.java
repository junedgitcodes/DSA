package org.example.Scaler.July30.SubArrayTotalSum;

public class Idea1 {

    //{3,2,5}
    //calculate total sum of sub array

    //sub array     sum
    //3             3
    //3,2           5
    //3,2,5         10
    //2             2
    //2,5           7
    //5             5
    //Total         32

    public static void main(String[] args) {
        int[] arr = {3, 2, 5};
        int result = subArrayTotal(arr);
        System.out.println("result = " + result);
    }

    public static int subArrayTotal(int[] arr) {
        int result = 0;
        for (int s = 0; s < arr.length; s++) {
            for (int e = s; e < arr.length; e++) {
                int sum = 0;
                for (int i = s; i <= e; i++) {
                    sum += arr[i];
                }
                result += sum;
            }
        }
        return result;
    }
}
