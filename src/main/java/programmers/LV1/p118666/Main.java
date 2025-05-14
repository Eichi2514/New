package programmers.LV1.p118666;

import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> scores = new HashMap<>();

        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == 4) continue;
            char type1 = survey[i].charAt(0);
            char type2 = survey[i].charAt(1);
            int score = choices[i] - 4;

            if (score < 0) {
                scores.put(type1, scores.getOrDefault(type1, 0) - score);
            } else {
                scores.put(type2, scores.getOrDefault(type2, 0) + score);
            }
        }

        String types = "RTCFJMAN";
        for (int i = 0; i < types.length(); i += 2) {
            char first = types.charAt(i);
            char second = types.charAt(i + 1);
            if (scores.getOrDefault(first, 0) >= scores.getOrDefault(second, 0)) {
                answer += first;
            } else {
                answer += second;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}));
        System.out.println(new Solution().solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}));
    }
}