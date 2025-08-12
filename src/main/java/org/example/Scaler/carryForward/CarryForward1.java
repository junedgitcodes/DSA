package org.example.Scaler.carryForward;

public class CarryForward1 {
    public static void main(String[] args) {

        String s = "bcaggaag";
        int count = 0;
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i) == 'a'){
                for(int j = i+1 ; j<s.length();j++){
                    if(s.charAt(j)=='g'){
                        count++;
                    }
                }
            }
        }
        System.out.println("count = " + count);
    }
}
