package programmers.LV1.p138477;

import java.util.*;

class Solution {
    public List<Integer> solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            ArrayList<Integer> temps = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                temps.add(score[j]);
            }
            Collections.sort(temps);
            if (i < k) answer.add(temps.get(0));
            else answer.add(temps.get(i - k + 1));
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
        System.out.println(new Solution().solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
    }
}