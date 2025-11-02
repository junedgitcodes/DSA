package org.example.Scaler.Day29.Class;

public class LocalMinima {
    public static void main(String[] args) {
        int[] A = {3,6,1,-1,9,15,8};
        System.out.println(localMinima(A));
    }

    public static int localMinima(int[] A){
        int n = A.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int midIdx = s+((e-s)/2);
            int mid = A[midIdx];
            if((midIdx==0 || mid<A[midIdx-1] )&&midIdx==n-1 || mid<A[midIdx+1]){
                return mid;
            } else if ((midIdx==0 || mid<A[midIdx-1]) && midIdx==n-1 || mid>A[midIdx+1]){
                s = midIdx+1;
            }else{
                e = midIdx-1;
            }
        }
        return -1;
    }
}
