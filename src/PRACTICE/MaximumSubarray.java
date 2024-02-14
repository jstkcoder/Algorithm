package PRACTICE;

public class MaximumSubarray {
    // 최대 연속 부분 배열 합을 계산하는 메서드
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // 최대 합 변수를 배열의 첫 번째 원소로 초기화
        int currentSum = nums[0]; // 현재 합 변수를 배열의 첫 번째 원소로 초기화

        // 배열의 나머지 원소들을 순회하면서 최대 합을 찾음
        for (int i = 1; i < nums.length; i++) {
            // 현재 합에 현재 원소를 더한 값과 현재 원소 값 중 큰 값을 현재 합으로 갱신
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // 최대 합을 현재 합과 최대 합 중 큰 값으로 갱신
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; // 최대 합 반환
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // 최대 연속 부분 배열 합을 한국어로 출력
        System.out.println("최대 연속 부분 배열 합: " + maxSubArray(nums));
    }
}
