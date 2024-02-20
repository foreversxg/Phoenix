package com.sxg;

import com.sxg.base.TowPoint;
import com.sxg.base.Unfinish;

@Unfinish
@TowPoint
public class Test027 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(removeElement(nums, 3));
        int[] nums2 = {1, 3, 3, 4};
        System.out.println(removeElement(nums2, 3));
        int[] nums3 = {3, 3, 3, 3};
        System.out.println(removeElement(nums3, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == val) {
                continue;
            }
            nums[left++] = nums[right];
        }
        return left;
    }

}
