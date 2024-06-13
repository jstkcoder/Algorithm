package PRACTICE;

import java.util.Stack;

public class ValidBracket {
    public boolean isValid(String s) {
        // 스택을 사용하여 괄호의 짝을 검사
        Stack<Character> stack = new Stack<>();

        // 문자열의 각 문자를 순회
        for (char c : s.toCharArray()) {
            // 여는 괄호는 스택에 추가
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // 닫는 괄호일 경우 스택이 비어있거나 짝이 맞지 않으면 false 반환
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // 스택이 비어있으면 모든 괄호가 짝이 맞음
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        String input4 = "([)]";
        String input5 = "{[]}";

        System.out.println("Input: " + input1 + " -> " + solution.isValid(input1));
        System.out.println("Input: " + input2 + " -> " + solution.isValid(input2));
        System.out.println("Input: " + input3 + " -> " + solution.isValid(input3));
        System.out.println("Input: " + input4 + " -> " + solution.isValid(input4));
        System.out.println("Input: " + input5 + " -> " + solution.isValid(input5));
    }
}
