package programmers.LV0.p120842;

import java.util.Arrays;

class Solution {
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;

        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index];
                index++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] result1 = new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        int[][] result2 = new Solution().solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3);

        System.out.println(Arrays.deepToString(result1));
        System.out.println(Arrays.deepToString(result2));
    }
}