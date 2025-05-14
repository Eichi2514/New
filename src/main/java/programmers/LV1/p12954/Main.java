package programmers.LV1.p12954;

import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        long[] result1 = new Solution().solution(2, 5);
        long[] result2 = new Solution().solution(4, 3);
        long[] result3 = new Solution().solution(-4, 2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}