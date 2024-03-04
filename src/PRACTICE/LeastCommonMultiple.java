package PRACTICE;

public class LeastCommonMultiple {
    // 두 정수의 최대 공약수를 계산하는 메서드
    public static int findGCD(int a, int b) {
        // 유클리드 호제법을 사용하여 최대 공약수 계산
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
        return a;
    }

    // 두 정수의 최소 공배수를 계산하는 메서드
    public static int findLCM(int a, int b) {
        // 최소 공배수 = (두 수의 곱) / 최대 공약수
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        int a1 = 12, b1 = 18;
        int a2 = 7, b2 = 5;

        // 두 정수의 최소 공배수를 찾아 출력
        System.out.println("두 정수 " + a1 + "와 " + b1 + "의 최소 공배수: " + findLCM(a1, b1));
        System.out.println("두 정수 " + a2 + "와 " + b2 + "의 최소 공배수: " + findLCM(a2, b2));
    }
}

