package programmers.LV0.p181833;

import java.util.Arrays;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] result1 = new Solution().solution(3);
        int[][] result2 = new Solution().solution(6);
        int[][] result3 = new Solution().solution(1);

        System.out.println(Arrays.deepToString(result1));
        System.out.println(Arrays.deepToString(result2));
        System.out.println(Arrays.deepToString(result3));
    }
}