package PRACTICE;

import java.util.Scanner;


// 소수 판단 프로그램
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 숫자 입력 받기
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // 소수인지 여부 판별
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // 소수 여부를 확인하는 메소드
    public static boolean isPrime(int num) {
        // 1 이하의 숫자는 소수가 아님
        if (num <= 1) {
            return false;
        }

        // 2부터 num의 제곱근까지 나누어 떨어지는지 확인
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}