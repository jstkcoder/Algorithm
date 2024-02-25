package PRACTICE;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    // 반복되지 않는 첫 번째 문자를 찾는 메서드
    public static char firstUniqChar(String s) {
        // 문자와 해당 문자의 등장 횟수를 저장하는 맵
        Map<Character, Integer> countMap = new HashMap<>();

        // 문자열을 순회하면서 각 문자의 등장 횟수를 계산
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // 문자열을 순회하면서 첫 번째로 등장하는 반복되지 않는 문자를 찾음
        for (char c : s.toCharArray()) {
            if (countMap.get(c) == 1) {
                return c; // 반복되지 않는 첫 번째 문자를 반환
            }
        }

        return ' '; // 반복되지 않는 문자가 없는 경우 공백 문자를 반환
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";

        // 각 문자열에서 반복되지 않는 첫 번째 문자를 찾아 출력
        System.out.println("첫 번째 반복되지 않는 문자 (s1): " + firstUniqChar(s1));
        System.out.println("첫 번째 반복되지 않는 문자 (s2): " + firstUniqChar(s2));
    }
}
