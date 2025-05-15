package programmers.LV0.p120882;

import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i]++;
            for (int j = 0; j < score.length; j++) {
                if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}});
        int[] result2 = new Solution().solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}