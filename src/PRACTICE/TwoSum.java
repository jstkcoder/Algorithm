package PRACTICE;

import java.util.HashMap;

public class TwoSum {


    // 주어진 배열에서 두 수의 인덱스를 반환하여 더해서 target이 되는 경우를 찾는 메서드
    public static int[] twoSum(int[] nums, int target) {
        // 각 숫자의 인덱스를 저장하기 위한 해시맵 생성
        HashMap<Integer, Integer> map = new HashMap<>();

        // 배열을 반복하면서
        for (int i = 0; i < nums.length; i++) {
            // 보수(complement)를 계산
            int complement = target - nums[i];

            // 보수가 해시맵에 존재하면 해당 숫자들의 인덱스를 반환
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // 그렇지 않으면 현재 숫자와 인덱스를 해시맵에 추가
            map.put(nums[i], i);
        }

        // 해결책이 없는 경우 빈 배열 반환
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // 결과
        int[] indices = twoSum(nums, target);
        System.out.println("두 수의 인덱스: [" + indices[0] + ", " + indices[1] + "]");
    }
}
