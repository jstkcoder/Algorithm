package DataStructure;

import java.util.Scanner;

public class Code09 {
    // n개의 정수를 입력받아 순서대로 배열에 저장한다. 그런 다음 모든 정수들을 한 칸씩 오른쪽으로 shift하라.
    // 마지막 정수는 배열의 첫 칸으로 이동하라
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] data = new int[n];

        for (int i = 0; i < n; i++)
            data[i] = kb.nextInt();
        kb.close();

        int tmp = data[n - 1];

        for (int i = n-2; i >= 0; i--) {
            data[i+1] = data[i];
        }
        data[0] = tmp;
        for (int i : data){
            System.out.println(i);
        }

    }
}
