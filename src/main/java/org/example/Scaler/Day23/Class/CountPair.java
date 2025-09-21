package org.example.Scaler.Day23.Class;

public class CountPair {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 8, 6, 15, 5, 12, 17, 7, 18};
        System.out.println(countAllPairs(A, 6));
    }

    public static int countAllPairs(int[] A, int m) {
        int[] freq = new int[m];
        for (int el : A) {
            freq[el % m]++;
        }

        int cnt = 0;
        cnt += (freq[0] * (freq[0] - 1)) / 2;
        int i = 1;
        int j = m - i;

        while (i < j) {
            cnt += freq[i] * freq[j];
            i++;
            j--;
        }
        if(i==j){
            cnt += (freq[i] * (freq[i] - 1)) / 2;
        }
        return cnt;
    }
}
