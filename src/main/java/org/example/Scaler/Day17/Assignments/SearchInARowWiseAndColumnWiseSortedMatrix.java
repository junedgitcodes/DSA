package org.example.Scaler.Day17.Assignments;

public class SearchInARowWiseAndColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 2;
        int result = search(arr, k);
        System.out.println(k + " --> " + result);
    }

    public static int search(int[][] A, int B) {

        int n = A.length;
        int m = A[0].length;
        int i = 0;
        int j =m-1;
        int ans = Integer.MAX_VALUE;

        while(i<n && j>=0){
            if(A[i][j] == B){
                int cand = (i+1)*1009+(j+1);
                ans = Math.min(ans,cand);
                j--;
            }else if (A[i][j]>B){
                j--;
            }else {
                i++;
            }
        }
        return  ans == Integer.MAX_VALUE ? -1 :ans;

    }
}
