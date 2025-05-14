package programmers.LV1.p42889;

import java.util.*;

class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageCount = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                stageCount[stages[i]]++;
            }
        }

        List<Pair> failureRates = new ArrayList<>();
        int totalPlayers = stages.length;

        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRates.add(new Pair(i, 0.0));
            } else {
                double failureRate = (double) stageCount[i] / totalPlayers;
                failureRates.add(new Pair(i, failureRate));
                totalPlayers -= stageCount[i];
            }
        }

        failureRates.sort((a, b) -> {
            if (a.second == b.second) {
                return Integer.compare(a.first, b.first);
            }
            return Double.compare(b.second, a.second);
        });

        for (int i = 0; i < failureRates.size(); i++) {
            answer[i] = failureRates.get(i).first;
        }

        return answer;
    }

    static class Pair {
        int first;
        double second;

        Pair(int first, double second) {
            this.first = first;
            this.second = second;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        int[] result2 = new Solution().solution(4, new int[]{4, 4, 4, 4, 4});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}