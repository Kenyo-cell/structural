package com.company;

public class BinOps {
    private final int RADIX = 2;

    public BinOps() {}

    public String sum(String a, String b){
        int numA = Integer.parseInt(a, RADIX);
        int numB = Integer.parseInt(b, RADIX);
        return Integer.toBinaryString(numA + numB);
    }

    public String mul(String a, String b) {
        int numA = Integer.parseInt(a, RADIX);
        int numB = Integer.parseInt(b, RADIX);
        return Integer.toBinaryString(numA * numB);
    }
}
