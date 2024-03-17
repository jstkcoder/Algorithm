package PRACTICE;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringTwoDistinct {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLen = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charMap.put(rightChar, charMap.getOrDefault(rightChar, 0) + 1);

            while (charMap.size() > 2) {
                char leftChar = s.charAt(left);
                charMap.put(leftChar, charMap.get(leftChar) - 1);
                if (charMap.get(leftChar) == 0) {
                    charMap.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s1 = "eceba";

        System.out.println(lengthOfLongestSubstringTwoDistinct(s1));
    }
}
