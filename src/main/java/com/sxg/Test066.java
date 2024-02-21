package com.sxg;

import com.sxg.base.Unfinish;

import java.util.Arrays;

@Unfinish
public class Test066 {

    public static void main(String[] args) {
        Arrays.stream(plus(new int[]{1, 2, 3})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(plus(new int[]{9, 9, 3})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(plus(new int[]{9, 9, 9})).forEach(System.out::print);
    }

    public static int[] plus(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i]++;
            nums[i] = nums[i] % 10;
            if (nums[i] != 0) {
                // 这个思路很重要
                return nums;
            }
        }
        int[] res = new int[nums.length + 1];
        res[0] = 1;
        return res;
    }

}
