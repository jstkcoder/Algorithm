package PRACTICE;

public class FibonacciTwo {
    // 재귀를 사용한 피보나치 계산 (비효율적)
    public int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // 동적 프로그래밍을 사용한 피보나치 계산 (효율적)
    public int fibDP(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    // 상수 공간을 사용한 피보나치 계산 (더 효율적)
    public int fibOptimized(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }

    public static void main(String[] args) {
        FibonacciTwo solution = new FibonacciTwo();
        int n = 10;

        System.out.println("피보나치 수열의 " + n + "번째 숫자 (재귀): " + solution.fibRecursive(n));
        System.out.println("피보나치 수열의 " + n + "번째 숫자 (동적 프로그래밍): " + solution.fibDP(n));
        System.out.println("피보나치 수열의 " + n + "번째 숫자 (상수 공간): " + solution.fibOptimized(n));
    }
}

