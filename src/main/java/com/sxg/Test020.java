package com.sxg;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test020 {


    public static void main(String[] args) {
        System.out.println(isValid("[]{}"));
        System.out.println(isValid("[]{}{"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("{[])}"));
        System.out.println(isValid("}[])"));
    }

    public static boolean isValid(String s) {

        if (s == null || s.length() % 2 == 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (stack.isEmpty() || stack.peek() != map.get(s.charAt(i))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }

        }
        return stack.isEmpty();

    }
}
