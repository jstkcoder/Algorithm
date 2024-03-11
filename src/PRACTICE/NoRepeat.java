package PRACTICE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NoRepeat {
    public static void main(String[] args) {
        String str1 = "abcabcbb";
        String str2 = "bbbbc";

        System.out.println(changeArr(str1) + ", " +changeArr(str2));
    }
    static int changeArr(String str) {
        char[] strArr = new char[str.length()];

        for(int i = 0; i < str.length(); i++) {
            strArr[i] = str.charAt(i);
        }

        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }


        return sb.toString().length();
    }
}
