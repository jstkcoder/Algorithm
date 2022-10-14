package TimeComplexity;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();
        int A[] = new int[Number];

        for (int i = 0; i < Number; i++) {
            A[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;
        for (int i = 0; i < Number; i++) {
            sum = sum + A[i];
        }
        // 한 과목과 관련된 수식을 총합한 후 관련된 수식으로 변환에 로직이 간단해짐
        System.out.println(sum * 100.0 / max / Number);
    }
}
