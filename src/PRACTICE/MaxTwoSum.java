package PRACTICE;

import java.util.Arrays;

public class MaxTwoSum {
    public static void main(String[] args) {
        int[] nums = {15,5,6,7,8,1};
        System.out.println(maxTwoSum(nums));
    }
    public static int maxTwoSum(int[] nums) {
        Arrays.sort(nums);


        return nums[nums.length - 1] + nums[nums.length -2];

    }
}
