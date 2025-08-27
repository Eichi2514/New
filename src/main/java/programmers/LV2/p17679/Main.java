package programmers.LV2.p17679;

class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];

        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }

        int totalRemoved = 0;

        while (true) {
            boolean[][] check = new boolean[m][n];
            boolean found = false;

            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = map[i][j];
                    if (c == ' ') continue;
                    if (c == map[i][j + 1] &&
                            c == map[i + 1][j] &&
                            c == map[i + 1][j + 1]) {
                        check[i][j] = true;
                        check[i][j + 1] = true;
                        check[i + 1][j] = true;
                        check[i + 1][j + 1] = true;
                        found = true;
                    }
                }
            }

            if (!found) break;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (check[i][j]) {
                        map[i][j] = ' ';
                        totalRemoved++;
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (map[i][j] == ' ') {
                        int k = i - 1;
                        while (k >= 0 && map[k][j] == ' ') k--;
                        if (k >= 0) {
                            map[i][j] = map[k][j];
                            map[k][j] = ' ';
                        }
                    }
                }
            }
        }

        return totalRemoved;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}));
        System.out.println(sol.solution(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}));
    }
}