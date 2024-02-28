package PRACTICE;

public class PalindromeCheck {

    // 주어진 문자열이 회문인지 확인하는 메서드
    public static boolean isPalindrome(String s) {
        // 문자열의 앞과 뒤에서 각각 한 글자씩 비교하면서 회문 여부를 확인
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // 공백 및 구두점을 무시하고 문자만 비교
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // 문자를 소문자로 변환하여 비교
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "hello";

        // 주어진 문자열이 회문인지 확인하여 출력
        System.out.println("s1은 회문인가요? " + isPalindrome(s1));
        System.out.println("s2은 회문인가요? " + isPalindrome(s2));
    }
}
