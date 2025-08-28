package programmers.LV2.p77885;

import java.util.*;

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long x = numbers[i];

            if ((x & 1L) == 0) {
                answer[i] = x + 1;
            } else {
                long t = (~x) & (x + 1);
                answer[i] = x + t - (t >> 1);
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(new long[]{2, 7})));
    }
}