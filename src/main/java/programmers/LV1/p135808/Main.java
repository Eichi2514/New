package programmers.LV1.p135808;

import java.util.*;

class Solution {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = 1; i <= score.length / m; i++) {
            answer += score[score.length - (m * i)] * m;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(new Solution().solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}