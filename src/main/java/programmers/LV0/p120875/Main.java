package programmers.LV0.p120875;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if (Math.abs((dots[0][1] - dots[1][1]) * (dots[2][0] - dots[3][0])) == Math.abs((dots[2][1] - dots[3][1]) * (dots[0][0] - dots[1][0])))
            return 1;
        if (Math.abs((dots[0][1] - dots[2][1]) * (dots[1][0] - dots[3][0])) == Math.abs((dots[1][1] - dots[3][1]) * (dots[0][0] - dots[2][0])))
            return 1;
        if (Math.abs((dots[0][1] - dots[3][1]) * (dots[1][0] - dots[2][0])) == Math.abs((dots[1][1] - dots[2][1]) * (dots[0][0] - dots[3][0])))
            return 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(new Solution().solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
    }
}