package PRACTICE;

import java.util.HashSet;
import java.util.Set;

//주어진 정수 배열에서 중복되지 않는 요소들의 합
public class UniqueElementsSum {
    // 중복되지 않는 요소들의 합을 계산하는 메서드
    public static int sumOfUnique(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>(); // 중복되지 않는 요소를 저장하기 위한 집합(Set)

        int sum = 0; // 요소들의 합을 저장할 변수

        // 배열을 순회하면서 중복되지 않는 요소들의 합을 계산
        for (int num : nums) {
            // 만약 집합에 현재 요소가 없으면 해당 요소를 집합에 추가하고 합에 더함
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 6, 3};

        System.out.println("중복되지 않는 요소들의 합: " + sumOfUnique(nums));
    }
}
