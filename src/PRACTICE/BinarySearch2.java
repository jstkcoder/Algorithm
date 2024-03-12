package PRACTICE;

public class BinarySearch2 {

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 12, 16, 23};
        int target1 = 8;
        int target2 = 11;

        System.out.println("Index of target " + target1 + ": " + binarySearch(nums, target1));
        System.out.println("Index of target " + target2 + ": " + binarySearch(nums, target2));
    }
}