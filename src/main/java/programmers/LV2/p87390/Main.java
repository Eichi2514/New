package programmers.LV2.p87390;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left + 1);
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            long idx = left + i;
            int r = (int)(idx / n);
            int c = (int)(idx % n);
            answer[i] = Math.max(r, c) + 1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(3, 2, 5)));
        System.out.println(Arrays.toString(new Solution().solution(4, 7, 14)));
    }
}