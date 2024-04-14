package PRACTICE;

import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("가장 긴 부분 문자열의 길이 (s1): " + lengthOfLongestSubstring(s1));
        System.out.println("가장 긴 부분 문자열의 길이 (s2): " + lengthOfLongestSubstring(s2));
        System.out.println("가장 긴 부분 문자열의 길이 (s3): " + lengthOfLongestSubstring(s3));
    }
}
