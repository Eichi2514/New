package programmers.LV2.p68936;

import java.util.*;

class Solution {
    private int[] answer = new int[2];
    private int[][] ps;

    public int[] solution(int[][] arr) {
        int n = arr.length;

        ps = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            int rowSum = 0;
            for (int j = 1; j <= n; j++) {
                rowSum += arr[i - 1][j - 1];
                ps[i][j] = ps[i - 1][j] + rowSum;
            }
        }

        compress(0, 0, n);
        return answer;
    }

     private void compress(int r, int c, int size) {
        int ones = sumOnes(r, c, size);
        if (ones == 0) {
            answer[0]++;
            return;
        }
        if (ones == size * size) {
            answer[1]++;
            return;
        }

         int half = size / 2;
        compress(r, c, half);
        compress(r, c + half, half);
        compress(r + half, c, half);
        compress(r + half, c + half, half);
    }

     private int sumOnes(int r, int c, int size) {
        int r2 = r + size;
        int c2 = c + size;
        return ps[r2][c2] - ps[r][c2] - ps[r2][c] + ps[r][c];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(new int[][]{{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}})));
        System.out.println(Arrays.toString(sol.solution(new int[][]{{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}})));
    }
}