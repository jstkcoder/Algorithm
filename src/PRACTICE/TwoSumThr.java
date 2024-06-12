package PRACTICE;

import java.util.HashMap;

public class TwoSumThr {
    public int[] twoSum(int[] nums, int target) {
        // 값을 키로, 해당 값의 인덱스를 값으로 저장할 해시맵 생성
        HashMap<Integer, Integer> map = new HashMap<>();

        // 배열의 각 요소를 순회
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // 해시맵에 보충값이 있는지 확인
            if (map.containsKey(complement)) {
                // 있다면 현재 값과 보충값을 반환
                return new int[] { nums[map.get(complement)], nums[i] };
            }

            // 해시맵에 현재 값을 추가
            map.put(nums[i], i);
        }

        // 문제가 명시적으로 하나의 해를 갖는다고 가정하기 때문에 이 부분에 도달하지 않음
        throw new IllegalArgumentException("해가 없습니다");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("두 수의 합이 " + target + "이 되는 숫자: [" + result[0] + ", " + result[1] + "]");
    }
}
