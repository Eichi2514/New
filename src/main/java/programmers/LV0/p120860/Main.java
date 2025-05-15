package programmers.LV0.p120860;

class Solution {
    public static int solution(int[][] dots) {
        int answer = 0;
        int min1 = dots[0][0];
        int min2 = dots[0][1];
        int max1 = dots[0][0];
        int max2 = dots[0][1];
        for (int i = 1; i < dots.length; i++) {
            min1 = Math.min(min1, dots[i][0]);
            min2 = Math.min(min2, dots[i][1]);
            max1 = Math.max(max1, dots[i][0]);
            max2 = Math.max(max2, dots[i][1]);
        }
        answer = (max1 - min1) * (max2 - min2);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println(new Solution().solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }
}