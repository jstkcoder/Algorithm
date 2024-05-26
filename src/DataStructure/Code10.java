package DataStructure;

public class Code10 {
    public static void main(String[] args) {
        // 1~100000 사이의 모든 소수들을 찾아서 출력하는 프로그램

        for (int n = 2; n <= 100000; n++) {
            boolean b = true;
            for (int i = 2; i * i <= n && b; i++) {
                if (n % i == 0)
                    b = false;
            }
            if (b)
                System.out.println(n);

        }
    }
}
