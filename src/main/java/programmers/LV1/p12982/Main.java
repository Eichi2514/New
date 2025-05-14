package programmers.LV1.p12982;

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) {
                budget -= d[i];
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(new Solution().solution(new int[]{2, 2, 3, 3}, 10));
    }
}