package PRACTICE;

public class FindFirstAndLastPosition {
    // 오름차순으로 정렬된 정수 배열이 주어지면 주어진 목표 값의 시작 위치와 끝 위치
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }

        // 목표의 첫번째 위치
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] != target) {
            return result;
        }
        result[0] = left;

        // 목표의 마지막 위치
        right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        result[1] = left;

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;

        int[] nums3 = {};
        int target3 = 0;

        int[] result1 = searchRange(nums1, target1);
        int[] result2 = searchRange(nums2, target2);
        int[] result3 = searchRange(nums3, target3);

        System.out.println("nums1: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("nums2: [" + result2[0] + ", " + result2[1] + "]");
        System.out.println("nums3: [" + result3[0] + ", " + result3[1] + "]");
    }
}

