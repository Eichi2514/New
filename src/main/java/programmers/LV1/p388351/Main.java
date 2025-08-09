package programmers.LV1.p388351;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            int target = toMinutes(schedules[i]);
            int limit = target + 10;

            boolean okAllWeekdays = true;

            for (int j = 0; j < 7; j++) {
                int day = ((startday - 1 + j) % 7) + 1;
                if (day == 6 || day == 7) continue;

                int checkIn = toMinutes(timelogs[i][j]);

                if (checkIn > limit) {
                    okAllWeekdays = false;
                    break;
                }
            }

            if (okAllWeekdays) answer++;
        }

        return answer;
    }

    private int toMinutes(int hhmm) {
        int h = hhmm / 100;
        int m = hhmm % 100;
        return h * 60 + m;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] schedules1 = {700, 800, 1100};
        int[][] timelogs1 = {
                {710, 2359, 1050, 700, 650, 631, 659},
                {800, 801, 805, 800, 759, 810, 809},
                {1105, 1001, 1002, 600, 1059, 1001, 1100}
        };
        int[] schedules2 = {730, 855, 700, 720};
        int[][] timelogs2 = {
                {710, 700, 650, 735, 700, 931, 912},
                {908, 901, 805, 815, 800, 831, 835},
                {705, 701, 702, 705, 710, 710, 711},
                {707, 731, 859, 913, 934, 931, 905}
        };

        System.out.println(new Solution().solution(schedules1, timelogs1, 5));
        System.out.println(new Solution().solution(schedules2, timelogs2, 1));
    }
}