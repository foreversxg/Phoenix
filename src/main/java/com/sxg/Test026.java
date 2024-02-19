package com.sxg;

public class Test026 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        int right = 0;
        int left = 0;
        while (right < nums.length) {
            if (nums[right] == nums[left]) {
                right++;
            } else {
                left++;
                // 让left维护一个不重复的数组长度
                nums[left] = nums[right];
                right++;

            }
        }
        return left + 1;

    }
}
