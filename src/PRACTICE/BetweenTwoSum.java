package PRACTICE;

import java.util.*;

public class BetweenTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] result1 = twoSum(nums1, target1);
        int[] result2 = twoSum(nums2, target2);

        System.out.println("두 수의 합이 " + target1 + "이 되는 두 수의 인덱스: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("두 수의 합이 " + target2 + "이 되는 두 수의 인덱스: [" + result2[0] + ", " + result2[1] + "]");
    }
}

