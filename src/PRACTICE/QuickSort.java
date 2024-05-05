package PRACTICE;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 3, 7, 1, 8, 4, 6};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}

