package PRACTICE;

import java.util.Arrays;

public class MaxProductOfTwoNumbers {

    // 배열에서 두 수를 선택하여 곱한 값 중 최대값을 찾는 메서드
    public static int maxProduct(int[] nums) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(nums);
        int n = nums.length;

        // 가장 큰 두 수를 선택하여 곱한 값이 최대값임
        return Math.max(nums[n - 1] * nums[n - 2], nums[0] * nums[1]);
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 6, 2, 8, 5};
        int[] nums2 = {10, 4, 7, 3, 9};

        // 주어진 정수 배열에서 두 수를 선택하여 곱한 값 중 최대값을 찾아 출력
        System.out.println("nums1에서 두 수를 선택하여 곱한 최대값: " + maxProduct(nums1));
        System.out.println("nums2에서 두 수를 선택하여 곱한 최대값: " + maxProduct(nums2));
    }
}

