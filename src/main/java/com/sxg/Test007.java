package com.sxg;

public class Test007 {


    public static void main(String[] args) {
        System.out.println(check(0));
        System.out.println(check(123321));
        System.out.println(check(12321));
        System.out.println(check(123221));
    }

    public static boolean check(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reversePart = 0;
        while (x > reversePart) {
            reversePart = reversePart * 10 + x % 10;
            x = x / 10;
        }
        return x == reversePart || x == reversePart / 10;
    }
}
