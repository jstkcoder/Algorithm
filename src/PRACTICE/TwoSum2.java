package PRACTICE;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    // 주어진 정수 배열에서 합이 target이 되는 두 수의 조합을 찾는 메서드
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // 정수 배열을 순회하면서 각 숫자의 인덱스를 저장
        int i = 0;
        while (i < nums.length) {
            int complement = target - nums[i];
            // complement와 매칭되는 숫자가 이미 저장된 경우, 두 수의 조합을 찾음
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            // 현재 숫자와 인덱스를 맵에 저장
            numToIndex.put(nums[i], i);
            i++;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        // 주어진 정수 배열에서 합이 target이 되는 두 수의 조합을 찾아 출력
        int[] result1 = findTwoSum(nums1, target1);
        int[] result2 = findTwoSum(nums2, target2);
        System.out.println("nums1에서 합이 " + target1 + "이 되는 두 수의 조합: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("nums2에서 합이 " + target2 + "이 되는 두 수의 조합: [" + result2[0] + ", " + result2[1] + "]");
    }
}

