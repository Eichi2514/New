package programmers.LV0.p181832;

import java.util.Arrays;

class Solution {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0;
        int y = -1;
        for (int i = 0; i < n; i++) {
            y++;
            answer[x][y] = num;
            num++;
        }
        while (n > 1) {
            n--;
            for (int i = 0; i < n; i++) {
                x++;
                answer[x][y] = num;
                num++;
            }
            for (int i = 0; i < n; i++) {
                y--;
                answer[x][y] = num;
                num++;
            }
            n--;
            for (int i = 0; i < n; i++) {
                x--;
                answer[x][y] = num;
                num++;
            }
            for (int i = 0; i < n; i++) {
                y++;
                answer[x][y] = num;
                num++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] result1 = new Solution().solution(4);
        int[][] result2 = new Solution().solution(5);

        System.out.println(Arrays.deepToString(result1));
        System.out.println(Arrays.deepToString(result2));
    }
}