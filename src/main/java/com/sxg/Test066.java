package com.sxg;

import java.util.Arrays;

public class Test066 {

    public static void main(String[] args) {
        Arrays.stream(plus(new int[]{1, 2, 3})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(plus(new int[]{9, 9, 3})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(plus(new int[]{9, 9, 9})).forEach(System.out::print);
    }

    public static int[] plus(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                // 这个思路很重要
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

}
