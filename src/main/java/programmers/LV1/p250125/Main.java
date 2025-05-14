package programmers.LV1.p250125;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        if (h > 0 && board[h][w].equals(board[h - 1][w])) answer++;
        if (h < board.length - 1 && board[h][w].equals(board[h + 1][w])) answer++;
        if (w > 0 && board[h][w].equals(board[h][w - 1])) answer++;
        if (w < board[0].length - 1 && board[h][w].equals(board[h][w + 1])) answer++;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}, 1, 1));
        System.out.println(new Solution().solution(new String[][]{{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}}, 0, 1));
    }
}