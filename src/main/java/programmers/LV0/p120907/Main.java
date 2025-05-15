package programmers.LV0.p120907;

import java.util.Arrays;

class Solution {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] answer2 = new String[5];
        for (int i = 0; i < quiz.length; i++) {
            quiz[i] = quiz[i].replaceAll(" - ", " + -");
            quiz[i] = quiz[i].replaceAll("--", "");
            answer2 = quiz[i].split(" ");
            long X = Integer.parseInt(answer2[0]);
            long Y = Integer.parseInt(answer2[2]);
            long Z = Integer.parseInt(answer2[4]);
            if (Z == X + Y) {
                answer[i] = "O";
            } else answer[i] = "X";
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});
        String[] result2 = new Solution().solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}