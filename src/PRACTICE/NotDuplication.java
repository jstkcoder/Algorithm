package PRACTICE;

import java.util.Arrays;
import java.util.HashSet;

public class NotDuplication {

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(duplicateCheck(nums));
    }


    static int duplicateCheck(int[] nums) {
        int result = 0;

        for (int num : nums)
            // XOR
            result ^= num;
        return result;
    }
}
