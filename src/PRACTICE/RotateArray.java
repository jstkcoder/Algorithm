package PRACTICE;

import java.util.Arrays;

//정수 배열 nums와 정수 k가 주어졌을 때, 배열을 오른쪽으로 k번 회전시키시오.
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // k가 배열 길이보다 클 경우를 대비하여 k를 n으로 나눈 나머지로 설정
        reverse(nums, 0, n - 1); // 전체 배열을 뒤집음
        reverse(nums, 0, k - 1); // 첫 k개의 요소를 뒤집음
        reverse(nums, k, n - 1); // 나머지 요소를 뒤집음
    }

    // 배열의 특정 부분을 뒤집는 메소드
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);
        System.out.println("회전된 배열: " + Arrays.toString(nums));
    }
}
