package PRACTICE;

import java.util.*;

public class UniqueTripletsSumZero {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // 배열을 오름차순으로 정렬
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) { // 중복된 요소 건너뛰기
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // 삼중 합이 0인 경우 결과에 추가
                    while (left < right && nums[left] == nums[left + 1]) left++; // 중복된 요소 건너뛰기
                    while (left < right && nums[right] == nums[right - 1]) right--; // 중복된 요소 건너뛰기
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {};

        List<List<Integer>> result1 = threeSum(nums1);
        List<List<Integer>> result2 = threeSum(nums2);

        System.out.println("nums1: " + result1);
        System.out.println("nums2: " + result2);
    }
}

