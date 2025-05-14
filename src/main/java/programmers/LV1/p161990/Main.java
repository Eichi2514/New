package programmers.LV1.p161990;

import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int a = 50;
        int b = 50;
        int c = 0;
        int d = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (a > i) a = i;
                    if (b > j) b = j;
                    if (c < i) c = i;
                    if (d < j) d = j;
                }
            }
        }
        answer = new int[]{a, b, c + 1, d + 1};
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new String[]{".#...", "..#..", "...#."});
        int[] result2 = new Solution().solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
        int[] result3 = new Solution().solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
        int[] result4 = new Solution().solution(new String[]{"..", "#."});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.toString(result4));
    }
}