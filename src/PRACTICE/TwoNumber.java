package PRACTICE;


import java.util.HashMap;

public class TwoNumber {

    // 주어진 정수 배열에서 단 한 번만 나타나는 두 요소를 찾는 메서드
    public static int[] singleNumber(int[] nums) {
        // 각 요소의 등장 횟수를 저장하는 맵
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // 배열을 순회하면서 각 요소의 등장 횟수를 계산
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 단 한 번만 나타나는 두 요소를 저장할 결과 배열
        int[] result = new int[2];
        int index = 0;

        // 맵을 순회하면서 등장 횟수가 1인 요소를 결과 배열에 저장
        for (HashMap.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                result[index++] = entry.getKey();
            }
            if (index == 2) {
                break; // 결과 배열이 꽉 찼으면 루프 종료
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};

        // 단 한 번만 나타나는 두 요소를 찾아 출력
        int[] result = singleNumber(nums);
        System.out.println("단 한 번만 나타나는 두 요소: [" + result[0] + ", " + result[1] + "]");
    }
}

