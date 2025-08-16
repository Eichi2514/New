package programmers.LV2.p132265;

import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> leftMap = new HashMap<>();
        Map<Integer, Integer> rightMap = new HashMap<>();
        int answer = 0;

        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
        }

        for (int i = 0; i < topping.length - 1; i++) {
            int t = topping[i];

            leftMap.put(t, leftMap.getOrDefault(t, 0) + 1);

            rightMap.put(t, rightMap.get(t) - 1);
            if (rightMap.get(t) == 0) {
                rightMap.remove(t);
            }

            if (leftMap.size() == rightMap.size()) {
                answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
        System.out.println(sol.solution(new int[]{1, 2, 3, 1, 4}));
    }
}