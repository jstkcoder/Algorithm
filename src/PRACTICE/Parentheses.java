package PRACTICE;

import java.util.*;

public class Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println(s1 + "은(는) 올바른 괄호입니까? " + isValid(s1));
        System.out.println(s2 + "은(는) 올바른 괄호입니까? " + isValid(s2));
        System.out.println(s3 + "은(는) 올바른 괄호입니까? " + isValid(s3));
        System.out.println(s4 + "은(는) 올바른 괄호입니까? " + isValid(s4));
        System.out.println(s5 + "은(는) 올바른 괄호입니까? " + isValid(s5));
    }
}