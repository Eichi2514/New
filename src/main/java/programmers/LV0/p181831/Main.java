package programmers.LV0.p181831;

class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    answer++;
                }
            }
        }
        if (answer == arr.length * arr[0].length) {
            return 1;
        } else return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}));
        System.out.println(new Solution().solution(new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}}));
    }
}