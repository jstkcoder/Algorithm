package PRACTICE;

public class PalindromeCheck2 {
    public static boolean isPalindrome(String str) {
        // 정규화로 공백 등을 제거
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            System.out.println(str.charAt(left));
            System.out.println(str.charAt(right));
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
