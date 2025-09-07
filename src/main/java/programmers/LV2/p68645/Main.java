package programmers.LV2.p68645;

import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int x = -1, y = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else {
                    x--;
                    y--;
                }
                triangle[x][y] = num++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                list.add(triangle[i][j]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(4)));
        System.out.println(Arrays.toString(sol.solution(5)));
        System.out.println(Arrays.toString(sol.solution(6)));
    }
}