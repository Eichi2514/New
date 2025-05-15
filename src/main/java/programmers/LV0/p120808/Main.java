package programmers.LV0.p120808;

import java.util.Arrays;

class Solution {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max = 0;

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        for (int i = 1; i <= denom && i <= numer; i++) {
            if (numer % i == 0 && denom % i == 0) {
                max = i;
            }
        }

        answer[0] = numer / max;
        answer[1] = denom / max;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(1, 2, 3, 4);
        int[] result2 = new Solution().solution(9, 2, 1, 3);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}