package PRACTICE;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        // 단계 1: 느린 포인터(slow)와 빠른 포인터(fast)를 배열의 첫 번째 요소로 초기화합니다.
        int slow = nums[0];
        int fast = nums[0];

        // 단계 2: 느린 포인터는 한 칸씩 이동하고, 빠른 포인터는 두 칸씩 이동하여 두 포인터가 만날 때까지 반복합니다.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // 단계 3: 빠른 포인터를 배열의 첫 번째 요소로 재설정합니다.
        fast = nums[0];

        // 단계 4: 두 포인터가 다시 만날 때까지 한 칸씩 이동합니다.
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        // 단계 5: 두 포인터가 만나는 지점이 중복된 숫자입니다.
        return slow;
    }

    public static void main(String[] args) {
        FindDuplicateNumber solution = new FindDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        int result = solution.findDuplicate(nums);
        System.out.println("중복된 숫자: " + result);
    }
}
