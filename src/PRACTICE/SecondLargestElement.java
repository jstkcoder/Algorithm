package PRACTICE;

import java.util.Arrays;

public class SecondLargestElement {
    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array does not contain enough distinct elements");
        }

        return second;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4, 5};
        int secondLargest = findSecondLargest(nums);
        System.out.println("두 번째로 큰 요소: " + secondLargest);
    }
}
