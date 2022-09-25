package TimeComplexity;

import java.util.Scanner;

public class Debuging {
    public static void main(String[] args) {
        // TODO 배열에서 주어진 범위의 합을 구하는 프로그램을 구하시오.
        // 스캐너 (입력) 생
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int answer = 0;

        // 배열 생성
        int A[] = new int[100001];
        int S[] = new int[100001];
        for (int i =  1; i < testCase; i++) {
            // 랜덤 함수로 A배열에 값을 넣음
            A[i] = (int) (Math.random() * Integer.MAX_VALUE);
            // S배열의 값
            S[i] = S[i - 1] + A[i];
        }


        for (int t = 1; t < testCase; t++) {
            int query = sc.nextInt();
            for (int i = 1; i < query; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();

                answer += S[end] - S[start - 1];
                System.out.printf(testCase + " " + answer);
            }
        }
    }
}
