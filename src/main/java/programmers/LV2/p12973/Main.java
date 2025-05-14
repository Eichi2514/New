package programmers.LV2.p12973;

import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("baabaa"));
        System.out.println(new Solution().solution("cdcd"));
    }
}