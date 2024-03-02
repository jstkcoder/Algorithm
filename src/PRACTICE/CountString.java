package PRACTICE;

import java.util.HashMap;
import java.util.Map;

public class CountString {

    // 주어진 문자열에서 각 문자의 등장 횟수를 세는 메서드
    public static Map<Character, Integer> countCharacterFrequency(String s) {
        // 각 문자의 등장 횟수를 저장할 맵
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // 문자열을 순회하면서 각 문자의 등장 횟수를 계산
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "mississippi";

        // 각 문자열에서 각 문자의 등장 횟수를 세어 출력
        System.out.println("문자열 s1의 각 문자의 등장 횟수: " + countCharacterFrequency(s1));
        System.out.println("문자열 s2의 각 문자의 등장 횟수: " + countCharacterFrequency(s2));
    }
}
