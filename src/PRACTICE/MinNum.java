package PRACTICE;

import java.util.Arrays;

public class MinNum {

    public static void main(String[] args) {
        int[] num = {3, 6, 2, 8, 5};

        Arrays.sort(num);
        System.out.println(num[0] + num[2]);
    }
}
