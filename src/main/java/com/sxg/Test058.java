package com.sxg;

import com.sxg.base.TowPoint;

@TowPoint
public class Test058 {

    public static void main(String[] args) {
        System.out.println(legnth("hello world"));
        System.out.println(legnth("hello world   "));
        System.out.println(legnth("  hello world"));
    }

    public static int legnth(String s) {
        int end = s.length() - 1;
        int start = 0;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }

}
