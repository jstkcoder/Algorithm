package PRACTICE;

public class MaximumSubarrayTest {
    public int maxSubArray(int[] nums) {
        // 현재 서브 배열의 합을 저장하는 변수
        int currentSubarray = nums[0];
        // 최대 서브 배열의 합을 저장하는 변수
        int maxSubarray = nums[0];

        // 배열의 두 번째 요소부터 마지막 요소까지 순회
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // 현재 요소를 포함한 새로운 서브 배열의 합을 계산
            currentSubarray = Math.max(num, currentSubarray + num);
            // 최대 서브 배열의 합을 갱신
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }

        // 최대 서브 배열의 합을 반환
        return maxSubarray;
    }

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = solution.maxSubArray(nums);
        System.out.println("최대 서브 배열 합: " + result);
    }
}
