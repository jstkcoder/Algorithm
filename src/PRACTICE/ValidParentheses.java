package PRACTICE;

import java.util.Stack;

public class ValidParentheses {

    // 주어진 문자열이 유효한 괄호인지 판별하는 메서드
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // 문자열을 순회하면서 괄호를 스택에 넣거나 빼면서 검사
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty(); // 스택이 비어있으면 모든 괄호가 짝이 맞아 유효한 괄호이므로 true 반환
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        // 각 문자열이 유효한 괄호인지 여부를 출력
        System.out.println("\"" + s1 + "\"은(는) 유효한 괄호입니까? " + isValid(s1));
        System.out.println("\"" + s2 + "\"은(는) 유효한 괄호입니까? " + isValid(s2));
        System.out.println("\"" + s3 + "\"은(는) 유효한 괄호입니까? " + isValid(s3));
        System.out.println("\"" + s4 + "\"은(는) 유효한 괄호입니까? " + isValid(s4));
        System.out.println("\"" + s5 + "\"은(는) 유효한 괄호입니까? " + isValid(s5));
    }
}

