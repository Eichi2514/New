package org.example;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] tmps = {video_len, pos, op_start, op_end};
        int[][] times = new int[4][2];

        for (int i = 0; i < 4; i++) {
            String[] cmd = tmps[i].split(":");
            for (int j = 0; j < 2; j++) {
                times[i][j] = Integer.parseInt(cmd[j]);
            }
        }

        times[1] = op_reset(times[1], times[2], times[3]);

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                times[1][1] += 10;
                if (times[1][1] >= 60) {
                    times[1][0]++;
                    times[1][1] -= 60;
                }
                if(times[1][0] > times[0][0]) {
                    times[1][0] = times[0][0];
                    times[1][1] = times[0][1];
                }else if (times[1][0] == times[0][0] && times[1][1] > times[0][1]) {
                    times[1][1] = times[0][1];
                }
            } else if (commands[i].equals("prev")) {
                times[1][1] -= 10;
                if (times[1][1] < 0) {
                    times[1][0]--;
                    times[1][1] += 60;
                }
                if(times[1][0] < 0) {
                    times[1][0] = 0;
                    times[1][1] = 0;
                }else if (times[1][0] == 0 && times[1][1] < 0) {
                    times[1][1] = 0;
                }
            }
            times[1] = op_reset(times[1], times[2], times[3]);
        }

        String mm = Integer.toString(times[1][0]);
        String ss = Integer.toString(times[1][1]);
        if (mm.length() < 2) mm = "0" + mm;
        if (ss.length() < 2) ss = "0" + ss;
        return mm + ":" + ss;
    }

    private int[] op_reset(int[] time, int[] start, int[] end) {
        if (start[0] < time[0] && time[0] < end[0]) {
            return new int[]{end[0], end[1]};
        } else if (start[0] != end[0] && start[0] == time[0] && start[1] <= time[1]) {
            return new int[]{end[0], end[1]};
        } else if (start[0] != end[0] && end[0] == time[0] && time[1] <= end[1]) {
            return new int[]{end[0], end[1]};
        } else if (start[0] == time[0] && end[0] == time[0] && start[1] <= time[1] && time[1] <= end[1]) {
            return new int[]{end[0], end[1]};
        }
        return time;
    }
}



public class Main {
    public static void main(String[] args) {
        String[] qwe = {"prev", "next"};
        // String[] qwe2 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        // String[][] qwe =
        //         {
        //                 {"1", "-1"},
        //                 {"1", "-1"}
        //         };
        // int[] asd = {3, 10, 1};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        // int[][] asd3 = {{1, 5}, {3, 5}};
        // int[][] asd4 = {{3,4}, {5,6}};
//        int[] asd = new Solution().solution(qwe, qwe2, 2);
//        for (int i = 0; i < asd.length; i++) {
//            System.out.println(asd[i]);
//        }
        System.out.println(new Solution().solution("10:00", "00:03", "00:00", "00:05", qwe));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}