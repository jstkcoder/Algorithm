package SORT;

import java.util.Random;

public class SelcetSort {

    public static void main(String[] args) {
        int [] arr = new int[]{10,2,3,4,5};

        solution(5, arr);
    }
    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
}
