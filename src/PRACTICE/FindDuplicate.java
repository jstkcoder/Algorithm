package PRACTICE;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        // 두 포인터 초기화
        int slow = nums[0];
        int fast = nums[0];

        // 처음 만남점 찾기
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // 사이클 시작 지점 찾기
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        FindDuplicate solution = new FindDuplicate();
        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};

        System.out.println("중복된 숫자 (예제 1): " + solution.findDuplicate(nums1));
        System.out.println("중복된 숫자 (예제 2): " + solution.findDuplicate(nums2));
    }
}

