package DataStructure;

import java.util.Scanner;

public class Code11 {
    // 사용자로부터 정수 개수 n을 입력받는다. 이어서 순서대로 배열에 저장한다. 그런다음 중복된 정수쌍의 개수를 카운트 해라
    // 순열
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      int n = kb.nextInt();
      int [] data = new int[n];
      for (int i = 0; i < n; i++)
        data[i] = kb.nextInt();

      kb.close();
      int count = 0;
      for (int i = 0; i < n; i++) {
       for (int j = i + 1; j < n; j++) {
        // data[i], data[j]
        if(data[i] == data[j])
         count++;
       }
      }
     System.out.println(count);
    }
}
