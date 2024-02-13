package PRACTICE;

import java.util.HashMap;
import java.util.Map;

public class HashSearch {
    public static void main(String[] args) {
        // 키-값 쌍을 저장하기 위한 해시맵 생성
        Map<String, Integer> map = new HashMap<>();

        // 일부 키-값 쌍을 해시맵에 추가
        map.put("사과", 10);
        map.put("바나나", 20);
        map.put("오렌지", 30);

        // 해시맵에서 특정 키를 검색
        String keyToSearch = "바나나";
        if (map.containsKey(keyToSearch)) {
            int value = map.get(keyToSearch);
            System.out.println("'" + keyToSearch + "'에 대한 값은: " + value);
        } else {
            System.out.println(keyToSearch + "'을(를) 찾을 수 없습니다.");
        }
    }
}

