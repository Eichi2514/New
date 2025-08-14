package programmers.LV2.p87946;

class Solution {
    int count = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] bs = new boolean[dungeons.length];
        dfs(k, dungeons, 0, bs);
        return count;
    }

    void dfs(int k, int[][] dungeons, int count, boolean[] bs) {
        this.count = Math.max(this.count, count);

        for (int i = 0; i < dungeons.length; i++) {
            int minNeed = dungeons[i][0];
            int cost = dungeons[i][1];

            if (!bs[i] && k >= minNeed) {
                bs[i] = true;
                dfs(k - cost, dungeons, count + 1, bs);
                bs[i] = false;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }
}