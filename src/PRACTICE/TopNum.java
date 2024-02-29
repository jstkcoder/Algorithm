package PRACTICE;


import java.util.Arrays;

public class TopNum {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 6, 2, 8, 5};
        Arrays.sort(nums);
        System.out.println("가장 큰 수 : " + nums[nums.length - 1]);
    }

}
