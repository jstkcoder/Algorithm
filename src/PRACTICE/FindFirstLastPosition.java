package PRACTICE;

public class FindFirstLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = 0, right = nums.length - 1;

        // find the left boundary
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1; // continue searching on the left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // find the right boundary
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                left = mid + 1; // continue searching on the right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int target2 = 6;

        int[] result1 = searchRange(nums, target1);
        int[] result2 = searchRange(nums, target2);

        System.out.println("대상 " + target1 + "의 시작 및 끝 위치: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("대상 " + target2 + "의 시작 및 끝 위치: [" + result2[0] + ", " + result2[1] + "]");
    }
}

