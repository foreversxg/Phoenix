package com.sxg;

import com.sxg.base.Window;

import java.util.HashMap;
import java.util.Map;

@Window
public class Test003 {


    public static void main(String[] args) {
        System.out.println(maxRep("abcra"));
        System.out.println(maxRep("ecabcra"));
    }

    public static int maxRep(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
