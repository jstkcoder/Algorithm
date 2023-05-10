package PRACTICE;

import java.util.Scanner;

public class BufferReaderBetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= a; i++)
            sb.append(i + "\n");
        System.out.println(sb);
    }
}
