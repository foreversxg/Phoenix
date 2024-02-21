package com.sxg;

import com.sxg.base.Dichotomy;
import com.sxg.base.Unfinish;

@Unfinish
@Dichotomy
public class Test035 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(find(nums, 3));
        int[] nums2 = {1, 3, 3, 4};
        System.out.println(find(nums2, 3));
        int[] nums3 = {1, 2, 2, 4};
        System.out.println(find(nums3, 3));
    }

    public static int find(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = nums.length;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (target <= nums[mid]) {
                position = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return position;
    }

}
