import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
        String outNum = sc.next();
        char[] arrayNum = outNum.toCharArray();

        int sum = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            sum += arrayNum[i] - '0';   // arrayNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
        }
        System.out.println(sum);
    }
}
