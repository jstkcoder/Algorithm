package PRACTICE;

import java.util.Arrays;

//public class MaximumMultiple {
//    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 4};
//        int[] nums2 = {-1, -2, -3,0, -4};
//
//
//        System.out.println("가장 큰 곱은 : " + multiple(nums1));
//        System.out.println("가장 큰 곱은 : " + multiple(nums2));
//    }
//    public static int multiple(int[] nums) {
//        int[] result = new int[nums.length];
//        int i = 0;
//        for (int num : nums) {
//            if (num < 0){
//                num *= -1;
//            }
//            result[i] = num;
//            i++;
//        }
//
//        Arrays.sort(result);
//        return result[result.length - 1] * result[result.length - 2];
//
//    }
//}
// 또다른 솔루션
public class MaximumMultiple {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Input array must contain at least two elements");
        }

        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-1, -2, -3, -4};

        System.out.println("Maximum product of two integers in nums1: " + maxProduct(nums1));
        System.out.println("Maximum product of two integers in nums2: " + maxProduct(nums2));
    }
}