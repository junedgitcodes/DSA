package org.example.Scaler.Day19.Assignments;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] arr = {5, 1, 5, 1, 4, 4, 6, 6, 2, 8};
        int[] result = solve(arr);
        for (int el : result) {
            System.out.println(el);
        }
    }

    public static int[] solve(int[] A) {
        int xorAll = 0;
        int[] result = new int[2];
        for (int el : A) {
            xorAll = xorAll ^ el;
        }
        int setBitForXorAll = 0;
        for (int i = 0; i < 32; i++) {
            if (checkIthSetBit(xorAll, i)) {
                setBitForXorAll = i;
                break;
            }
        }

        int num1 = 0;
        int num2 = 0;
        for (int el : A) {
            if (checkIthSetBit(el, setBitForXorAll)) {
                num2 = num2 ^ el;
            } else {
                num1 = num1 ^ el;
            }
        }
        if(num2>num1){
            result[0] = num1;
            result[1] = num2;
        }else {
            result[1] = num1;
            result[0] = num2;
        }

        return result;
    }

    public static boolean checkIthSetBit(int A, int B) {
        return (A & (1 << B)) != 0;
    }
}
