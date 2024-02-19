package PRACTICE;

public class BinarySearchTwo {
    // 이진 검색(Binary Search)을 사용하여 대상 값의 인덱스 또는 삽입 위치의 인덱스를 반환하는 메서드
    public static int searchInsert(int[] nums, int target) {
        int left = 0; // 배열의 왼쪽 인덱스
        int right = nums.length - 1; // 배열의 오른쪽 인덱스

        while (left <= right) {
            int mid = left + (right - left) / 2; // 중간 인덱스 계산

            // 대상 값이 중간 값과 일치하면 해당 인덱스 반환
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1; // 대상 값이 중간 값보다 크면 오른쪽 부분 배열에서 탐색
            } else {
                right = mid - 1; // 대상 값이 중간 값보다 작으면 왼쪽 부분 배열에서 탐색
            }
        }

        return left; // 대상 값이 배열에 없는 경우 삽입 위치의 인덱스 반환
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        // 각 대상 값에 대한 인덱스 또는 삽입 위치의 인덱스를 출력
        System.out.println("대상 값 5의 인덱스: " + searchInsert(nums, target1));
        System.out.println("대상 값 2의 인덱스: " + searchInsert(nums, target2));
        System.out.println("대상 값 7의 인덱스: " + searchInsert(nums, target3));
    }
}
