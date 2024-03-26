package PRACTICE;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        int left = 0, right = str.length() - 1;
        while (left < right) {

            char leftChar = Character.toLowerCase(str.charAt(left));
            char rightChar = Character.toLowerCase(str.charAt(right));

            if (!Character.isLetterOrDigit(leftChar)) // 문자인지 아닌지 확인
                left++;
            else if (!Character.isLetterOrDigit(rightChar))
                right--;
            else if (leftChar != rightChar)
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        if (isPalindrome(str))
            System.out.println("회문 입니다.");
        else
            System.out.println("회문이 아닙니다.");
    }
}
