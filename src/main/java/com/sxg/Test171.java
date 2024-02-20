package com.sxg;

public class Test171 {


    public static void main(String[] args) {
        System.out.println('B' - 'A' + 1);
        System.out.println('C' - 'A' + 1);
        System.out.println(run("AA"));
        System.out.println(run("AB"));
    }

    public static int run(String alpha) {
        int number = 0;
        int multi = 1;
        for (int i = alpha.length() - 1; i >= 0; i--) {
            int k = alpha.charAt(i) - 'A' + 1;
            number = number + k * multi;
            multi *= 26;
        }
        return number;
    }

}
