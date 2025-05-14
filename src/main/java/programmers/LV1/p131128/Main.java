package programmers.LV1.p131128;

import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> countX = new HashMap<>();
        HashMap<Character, Integer> countY = new HashMap<>();

        for (char c : X.toCharArray()) {
            countX.put(c, countX.getOrDefault(c, 0) + 1);
        }
        for (char c : Y.toCharArray()) {
            countY.put(c, countY.getOrDefault(c, 0) + 1);
        }

        for (char c = '9'; c >= '0'; c--) {
            int commonCount = Math.min(countX.getOrDefault(c, 0), countY.getOrDefault(c, 0));
            for (int i = 0; i < commonCount; i++) {
                answer.append(c);
            }
        }

        if (answer.length() == 0) return "-1";
        if (answer.charAt(0) == '0') return "0";

        return answer.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("100", "2345"));
        System.out.println(new Solution().solution("100", "203045"));
        System.out.println(new Solution().solution("100", "123450"));
        System.out.println(new Solution().solution("12321", "42531"));
        System.out.println(new Solution().solution("5525", "1255"));
    }
}