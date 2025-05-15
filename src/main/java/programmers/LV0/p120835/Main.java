package programmers.LV0.p120835;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = 1;
        }

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{3, 76, 24});
        int[] result2 = new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7});
        int[] result3 = new Solution().solution(new int[]{30, 10, 23, 6, 100});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}