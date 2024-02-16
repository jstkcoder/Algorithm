package PRACTICE;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 100; // 출력할 숫자 범위

        // 1부터 n까지의 숫자를 출력하면서 규칙에 따라 "Fizz", "Buzz", "FizzBuzz" 출력
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
