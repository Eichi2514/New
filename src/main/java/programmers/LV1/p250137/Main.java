package programmers.LV1.p250137;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int count = 0;
        int time = 0;
        int index = 0;

        while (answer >= 0 && index < attacks.length) {
            count++;
            time++;
            if (time == attacks[index][0]) {
                answer -= attacks[index][1];
                index++;
                count = 0;
            } else {
                if (answer + bandage[1] < health) answer += bandage[1];
                else answer = health;
                if (count == bandage[0]) {
                    count = 0;
                    if (answer + bandage[2] < health) {
                        answer += bandage[2];
                    } else {
                        answer = health;
                    }
                }
            }
        }
        if (answer <= 0) return -1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}}));
        System.out.println(new Solution().solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));
        System.out.println(new Solution().solution(new int[]{4, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));
        System.out.println(new Solution().solution(new int[]{1, 1, 1}, 5, new int[][]{{1, 2}, {3, 2}}));
    }
}