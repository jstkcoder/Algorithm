package PRACTICE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    // 주어진 정수 배열에서 중복된 숫자를 찾는 메서드
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // 배열을 순회하면서 중복된 숫자를 찾음
        for (int num : nums) {
            if (!set.add(num)) {
                result.add(num); // 중복된 숫자를 결과 리스트에 추가
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 2, 6, 8, 2, 5, 4};
        int[] nums2 = {1, 3, 7, 9, 2, 5};

        // 주어진 정수 배열에서 중복된 숫자를 찾아 출력
        System.out.println("nums1에서 중복된 숫자: " + findDuplicates(nums1));
        System.out.println("nums2에서 중복된 숫자: " + findDuplicates(nums2));
    }
}

