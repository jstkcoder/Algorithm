package PRACTICE;

import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // 초기화: 왼쪽 곱셈 결과
        Arrays.fill(result, 1);

        // 왼쪽에서 오른쪽으로 누적 곱셈
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // 오른쪽에서 왼쪽으로 누적 곱셈
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        System.out.println("결과 배열: " + Arrays.toString(result));
    }
}
