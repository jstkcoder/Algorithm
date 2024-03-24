package PRACTICE;

import java.util.Arrays;

public class ChooseArrayNumber {
    static int chooseNum (int[] arr, int k) {
        int result = 0;
        Arrays.sort(arr);

        result = arr[k - 1];
        return result;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {3, 2, 5, 1, 7};


    }
}
