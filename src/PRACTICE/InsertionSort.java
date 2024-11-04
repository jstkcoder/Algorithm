package PRACTICE;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 3, 7, 1, 8, 4, 6};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("test");
    }
}

