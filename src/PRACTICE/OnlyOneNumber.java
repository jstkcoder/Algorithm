package PRACTICE;

public class OnlyOneNumber {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};

        System.out.println("nums1에서 한 번만 나타나는 요소: " + findSingleNumber(nums1));
        System.out.println("nums2에서 한 번만 나타나는 요소: " + findSingleNumber(nums2));
    }
}
