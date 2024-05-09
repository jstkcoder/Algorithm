package PRACTICE;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 3, 7, 1, 8, 4, 6};
        selectionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}

