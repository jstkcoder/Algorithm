package PRACTICE;

import java.util.Arrays;

public class MaximumProduct {

    // 두 가지 다른 요소의 최대 곱을 출력할 함수
    public static int maxProduct(int[] nums) {

        // 큰 순서대로 정렬
        Arrays.sort(nums);

        int n = nums.length;
        return Math.max(nums[0] * nums[1], nums[n-2] * nums[n-1]);
    }
    public static void main(String[] args) {

        int[] nums = {3, 5, 2, 6};

        System.out.println("두 가지 다른 요소의 최대 곱 : " + maxProduct(nums));
    }
}
