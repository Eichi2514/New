package programmers.LV2.p17684;

import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dict = new HashMap<>();
        int dictIndex = 1;
        for (char c = 'A'; c <= 'Z'; c++) {
            dict.put(String.valueOf(c), dictIndex++);
        }

        List<Integer> output = new ArrayList<>();
        int i = 0;
        while (i < msg.length()) {
            String w = "";
            int j = i;

            while (j < msg.length()) {
                String next = msg.substring(i, j + 1);
                if (dict.containsKey(next)) {
                    w = next;
                    j++;
                } else {
                    break;
                }
            }

            output.add(dict.get(w));

            if (j < msg.length()) {
                String wc = msg.substring(i, j + 1);
                dict.put(wc, dictIndex++);
            }

            i += w.length();
        }

        int[] answer = new int[output.size()];
        for (int k = 0; k < output.size(); k++) {
            answer[k] = output.get(k);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution("KAKAO")));
        System.out.println(Arrays.toString(sol.solution("TOBEORNOTTOBEORTOBEORNOT")));
        System.out.println(Arrays.toString(sol.solution("ABABABABABABABAB")));

    }
}