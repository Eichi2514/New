package programmers.LV1.p142086;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for (int i = 1; i < s.length(); i++) {
            answer[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution("banana");
        int[] result2 = new Solution().solution("foobar");

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}