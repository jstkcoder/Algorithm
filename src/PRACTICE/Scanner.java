package PRACTICE;

import java.io.InputStream;

public class Scanner {
    public Scanner(InputStream in) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a + b);
    }

    private int nextInt() {
    return 0;
    }
}
