package PRACTICE;

import java.util.*;

public class IndexPairsSumTarget {
    public static List<List<Integer>> indexPairs(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result.add(Arrays.asList(map.get(target - nums[i]), i));
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 6;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {2, 7, 11, 15};
        int target3 = 9;

        List<List<Integer>> result1 = indexPairs(nums1, target1);
        List<List<Integer>> result2 = indexPairs(nums2, target2);
        List<List<Integer>> result3 = indexPairs(nums3, target3);

        System.out.println("nums1: " + result1);
        System.out.println("nums2: " + result2);
        System.out.println("nums3: " + result3);
    }
}
