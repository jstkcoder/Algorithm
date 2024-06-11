package PRACTICE;

public class FindMax {
    public int findMax(int[] nums) {
        // 배열이 비어있는 경우 예외 처리
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있습니다.");
        }

        // 초기 최대값을 배열의 첫 번째 요소로 설정
        int max = nums[0];

        // 배열의 각 요소를 순회하면서 최대값 찾기
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        FindMax solution = new FindMax();
        int[] nums = {3, 5, 7, 2, 8};
        int max = solution.findMax(nums);
        System.out.println("가장 큰 수: " + max);
    }
}
