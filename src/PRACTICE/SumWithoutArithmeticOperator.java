package PRACTICE;

public class SumWithoutArithmeticOperator {

    // 두 정수의 합을 계산하는 메서드
    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b; // 올림을 계산
            a = a ^ b; // 비트별 합을 계산
            b = carry << 1; // 올림을 왼쪽으로 시프트하여 다음 반복에 사용
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println("두 정수의 합: " + getSum(a, b));

        a = -2;
        b = 3;
        System.out.println("두 정수의 합: " + getSum(a, b));
    }
}

