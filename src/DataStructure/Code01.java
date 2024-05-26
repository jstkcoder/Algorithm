package DataStructure;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {
        int number = 123;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("test : ");
        int input = keyboard.nextInt();

        if (input == number) {
            System.out.println("Match!");
        } else {
            System.out.println("not!");
        }
    }

}
