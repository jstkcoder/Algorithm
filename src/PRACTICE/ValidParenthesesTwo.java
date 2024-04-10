package PRACTICE;

import java.util.*;

public class ValidParenthesesTwo {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty() && isMatching(stack.peek(), c)) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println("s1은 유효한 괄호입니까? " + isValid(s1));
        System.out.println("s2는 유효한 괄호입니까? " + isValid(s2));
        System.out.println("s3은 유효한 괄호입니까? " + isValid(s3));
        System.out.println("s4는 유효한 괄호입니까? " + isValid(s4));
        System.out.println("s5는 유효한 괄호입니까? " + isValid(s5));
    }
}
