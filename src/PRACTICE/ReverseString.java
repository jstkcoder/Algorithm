package PRACTICE;

public class ReverseString {
    public String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        // 왼쪽 인덱스가 오른쪽 인덱스보다 작을 때까지 반복
        while (left < right) {
            // 두 문자를 교환
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // 인덱스를 움직임
            left++;
            right--;
        }

        // 결과를 문자열로 반환
        return new String(charArray);
    }

    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        String input = "hello";
        String result = solution.reverseString(input);
        System.out.println("반전된 문자열: " + result);
    }
}

