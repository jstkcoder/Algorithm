package PRACTICE;

import java.util.Arrays;

// 먼저 배열을 정렬한 다음 2포인터 접근 방식을 사용하여 배열을 반복하고 합계가 대상에 가장 가까운 정수 3개를 찾음.
// 더 가까운 합계가 발견될 때마다 가장 가까운 합계를 업데이트.
// 마지막으로 가장 가까운 합계를 반환
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println("가까운 정수의 3개의 합: " + threeSumClosest(nums, target));
    }
}
