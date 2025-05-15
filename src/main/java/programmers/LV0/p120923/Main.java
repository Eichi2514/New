package programmers.LV0.p120923;

import java.util.Arrays;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total / num) - ((num - 1) / 2);
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(3, 12);
        int[] result2 = new Solution().solution(5, 15);
        int[] result3 = new Solution().solution(4, 14);
        int[] result4 = new Solution().solution(5, 5);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.toString(result4));
    }
}