package programmers.LV1.p136798;

import java.lang.Math;

class Solution {
    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int divisorCount = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    divisorCount++;
                    if (j != i / j) {
                        divisorCount++;
                    }
                }
            }
            if (divisorCount > limit) {
                answer += power;
            } else answer += divisorCount;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(5, 3, 2));
        System.out.println(new Solution().solution(10, 3, 2));
    }
}