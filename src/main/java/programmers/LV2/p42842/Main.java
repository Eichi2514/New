package programmers.LV2.p42842;

import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int i = 3; i <= total / 2; i++) {
            if (total % i == 0) {
                int j = total / i;
                if ((i - 2) * (j - 2) == yellow) {
                    return new int[]{j, i};
                }
            }
        }

        return new int[]{};
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(10, 2);
        int[] result2 = new Solution().solution(8, 1);
        int[] result3 = new Solution().solution(24, 24);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}