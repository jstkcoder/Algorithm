package PRACTICE;

import java.util.Scanner;

public class ThanksGiving {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("송편 만들기에 오신 것을 환영합니다!");
        System.out.print("만들고 싶은 송편 개수를 입력하세요: ");
        int numSongpyeon = scanner.nextInt();

        System.out.println("\n이제 어떤 송편을 만들지 선택해주세요:");
        System.out.println("1. 송편 만들기 (기본 속재료)");
        System.out.println("2. 송편 만들기 (다른 속재료 선택)");
        int choice = scanner.nextInt();

        String filling = "기본 속재료";
        if (choice == 2) {
            System.out.print("사용할 다른 속재료를 입력하세요: ");
            filling = scanner.next();
        }

        System.out.println("\n송편 만들기를 시작합니다!\n");

        makeSongpyeon(numSongpyeon, filling);

        System.out.println("\n송편 만들기가 완료되었습니다. 맛있는 송편을 즐겨보세요!");

        scanner.close();
    }

    static void makeSongpyeon(int numSongpyeon, String filling) {
        for (int i = 1; i <= numSongpyeon; i++) {
            System.out.println("송편 #" + i + " 만들기 시작");
            System.out.println("1단계: 떡 반죽 준비하기");
            System.out.println("2단계: 반죽을 펴서 " + filling + " 넣기");
            System.out.println("3단계: 작은 반달 모양으로 반죽 만들기");
            System.out.println("4단계: 끓는 물에 송편 끓이기 (5분)");
            System.out.println("5단계: 끓인 송편 꺼내어 식히기");
            System.out.println("6단계: 송편을 내어주고 즐겨보세요!");
            System.out.println(); // 가독성을 위한 빈 줄
        }
    }
}

