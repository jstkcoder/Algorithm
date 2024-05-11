package PRACTICE;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleTest {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("메시지를 입력하세요: ");
            String message = reader.readLine();
            System.out.println("입력된 메시지: " + message);
        } catch (IOException e) {
            System.out.println("예외가 발생하였습니다:" + e);
        }

    }
}
