package PRACTICE;

// 다른 array 및 map 사용 x
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("중복된 요소를 제거한 후 nums1의 길이: " + removeDuplicates(nums1));
        System.out.println("중복된 요소를 제거한 후 nums2의 길이: " + removeDuplicates(nums2));
    }
}

