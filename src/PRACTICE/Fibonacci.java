package PRACTICE;

public class Fibonacci {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Fibonacci solution = new Fibonacci();
        int n = 5;
        int result = solution.fib(n);
        System.out.println(n + "번째 피보나치 수는: " + result);
    }
}
