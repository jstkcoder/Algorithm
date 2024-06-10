package PRACTICE;

import java.util.*;

public class ArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // 첫 번째 배열의 모든 요소를 set1에 추가
        for (int num : nums1) {
            set1.add(num);
        }

        // 두 번째 배열을 순회하면서 교집합 요소 찾기
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // 교집합 요소를 배열로 변환하여 반환
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayIntersection solution = new ArrayIntersection();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersection(nums1, nums2);
        System.out.println("교집합: " + Arrays.toString(result));
    }
}
