package com.sxg;

public class Test013 {

    public static void main(String[] args) {
        System.out.println(romanToInt("VII"));
        System.out.println(romanToInt("XVII"));
        System.out.println(romanToInt("XIV"));
    }


    public static int romanToInt(String s) {
        int preNum = getValue(s.charAt(0));
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num) {
                // 核心就是以preNum作为累加的标的。
                sum = sum - preNum;
            } else {
                sum = sum + preNum;
            }
            preNum = num;
        }
        sum = sum + preNum;
        return sum;
    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
