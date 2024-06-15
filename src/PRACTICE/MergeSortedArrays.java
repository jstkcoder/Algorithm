package PRACTICE;

import java.util.Arrays;

public class MergeSortedArrays {
    public int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // 두 배열을 순회하며 병합
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // 남아있는 요소들을 병합
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        MergeSortedArrays solution = new MergeSortedArrays();
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] result = solution.merge(nums1, nums2);
        System.out.println("병합된 배열: " + Arrays.toString(result));
    }
}

