package org.example.Scaler.prefixsum;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = {-5, 10, 20, 40, 35, -1, -10};
        int[][] queries = {{0, 4}, {1, 2}, {2, 5}, {3, 4}, {2, 2}};
        prefix(arr, queries);
    }

    public static void prefix(int arr[], int[][] queries) {

        int s,e;
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            s=queries[i][0];
            e=queries[i][1];
            
            for(int j=s;j<=e;j++){
                sum += arr[j];
            }
            System.out.println("sum = " + sum);
        }

    }
}
