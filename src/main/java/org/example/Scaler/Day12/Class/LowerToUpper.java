package org.example.Scaler.Day12.Class;

public class LowerToUpper {
    public static void main(String[] args) {
        String str = "Hello";
        char[] arr = str.toCharArray();


        for (int i = 0; i < str.length(); i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            } else {
                arr[i] = (char) (arr[i] - 32);
            }
        }
        System.out.println(new String(arr));
    }
}
