package programmers.LV0.p120866;

class Solution {
    public static int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    if (i > 0 && j > 0) {
                        if (board[i - 1][j - 1] == 0) board[i - 1][j - 1] = 2;
                    }
                    if (i > 0) {
                        if (board[i - 1][j] == 0) board[i - 1][j] = 2;
                    }
                    if (i > 0 && j < board.length - 1) {
                        if (board[i - 1][j + 1] == 0) board[i - 1][j + 1] = 2;
                    }
                    if (j > 0) {
                        if (board[i][j - 1] == 0) board[i][j - 1] = 2;
                    }
                    if (j < board.length - 1) {
                        if (board[i][j + 1] == 0) board[i][j + 1] = 2;
                    }
                    if (j > 0 && i < board.length - 1) {
                        if (board[i + 1][j - 1] == 0) board[i + 1][j - 1] = 2;
                    }
                    if (i < board.length - 1) {
                        if (board[i + 1][j] == 0) board[i + 1][j] = 2;
                    }
                    if (i < board.length - 1 && j < board.length - 1) {
                        if (board[i + 1][j + 1] == 0) board[i + 1][j + 1] = 2;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(new Solution().solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(new Solution().solution(new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}}));
    }
}