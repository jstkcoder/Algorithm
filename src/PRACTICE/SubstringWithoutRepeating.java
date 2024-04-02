package PRACTICE;

import java.util.*;

public class SubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";

        System.out.println("가장 긴 부분 문자열의 길이 (중복 없음) - s1: " + lengthOfLongestSubstring(s1));
        System.out.println("가장 긴 부분 문자열의 길이 (중복 없음) - s2: " + lengthOfLongestSubstring(s2));
    }
}