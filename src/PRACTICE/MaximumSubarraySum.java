package PRACTICE;

public class MaximumSubarraySum {

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
            System.out.println("현재 합 : " + currentSum);
            System.out.println("총 합 : " + maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1, 2, 3, -2, 5};

        System.out.println("부분 수열의 합 중 가장 큰 값: " + maxSubArray(nums1));

    }
}

