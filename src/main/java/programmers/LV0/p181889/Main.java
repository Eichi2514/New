package programmers.LV0.p181889;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{2, 1, 6}, 1);
        int[] result2 = new Solution().solution(new int[]{5, 2, 1, 7, 5}, 3);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}