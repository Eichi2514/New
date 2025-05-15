package programmers.LV0.p120911;

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
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
        System.out.println(new Solution().solution("Bcad"));
        System.out.println(new Solution().solution("heLLo"));
        System.out.println(new Solution().solution("Python"));
    }
}