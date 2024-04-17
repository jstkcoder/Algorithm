package PRACTICE;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 5, 8, 6, 7};

        System.out.println("피벗 인덱스 (nums1): " + pivotIndex(nums1));
        System.out.println("피벗 인덱스 (nums2): " + pivotIndex(nums2));
    }
}
