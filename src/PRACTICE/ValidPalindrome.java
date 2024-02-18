package PRACTICE;

public class ValidPalindrome {
    // 주어진 문자열이 유효한 회문인지 판별하는 메서드
    public static boolean isValidPalindrome(String s) {
        // 문자열의 양 끝에서 포인터를 시작하여 비교
        int left = 0;
        int right = s.length() - 1;

        // 포인터가 만날 때까지 반복하여 비교
        while (left < right) {
            // 만약 문자가 다르면
            if (s.charAt(left) != s.charAt(right)) {
                // 왼쪽 문자를 제거했을 때 유효한 회문이 되는지 확인
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true; // 모든 문자가 일치하면 유효한 회문
    }

    // 주어진 문자열이 회문인지 판별하는 보조 메서드
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "abca";

        // 각 문자열이 유효한 회문인지 한국어로 출력
        System.out.println("\"" + s1 + "\"은(는) 유효한 회문입니까? " + (isValidPalindrome(s1) ? "네" : "아니요"));
        System.out.println("\"" + s2 + "\"은(는) 유효한 회문입니까? " + (isValidPalindrome(s2) ? "네" : "아니요"));
    }
}
