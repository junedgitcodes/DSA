package org.example.Scaler.Aug08LabSessionOn2DMatrix;

public class Q2ColumnWiseSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        columnWiseSum(mat);
    }

    public static void columnWiseSum(int[][] A){

        for(int i =0;i<A[0].length;i++){
            int sum = 0;
            for(int j =0;j<A.length;j++){
                sum = sum+ A[j][i];
            }
            System.out.println(sum);
        }
    }
}
