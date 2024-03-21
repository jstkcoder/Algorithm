package PRACTICE;

import java.util.Arrays;

public class MaximumMultiple {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-1, -2, -3,0, -4};


        System.out.println("가장 큰 곱은 : " + multiple(nums1));
        System.out.println("가장 큰 곱은 : " + multiple(nums2));
    }
    public static int multiple(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            if (num < 0){
                num *= -1;
            }
            result[i] = num;
            i++;
        }

        Arrays.sort(result);
        return result[result.length - 1] * result[result.length - 2];

    }
}
