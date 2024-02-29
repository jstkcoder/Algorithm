package PRACTICE;

public class CommonFactor {
    public static int findCommonFactor(int num1, int num2) {
        int result = 1;

        int minNum = Math.min(num1, num2);

        for (int i = minNum; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        System.out.println("두 수의 최대 공약수는 : " + findCommonFactor(num1, num2));

    }
}
