package programmers.LV0.p120896;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            int count = -1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) tmp += s.charAt(i);
        }
        char[] chars = tmp.toLowerCase().toCharArray();
        Arrays.sort(chars);
        String answer = "";
        for (int i = 0; i < chars.length; i++) {
            answer += chars[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abcabcadc"));
        System.out.println(new Solution().solution("abdc"));
        System.out.println(new Solution().solution("hello"));
    }
}