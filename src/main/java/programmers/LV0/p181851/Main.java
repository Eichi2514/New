package programmers.LV0.p181851;

import java.util.Arrays;

class Solution {
    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] tmp = new int[rank.length];
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) tmp[i] = rank[i];
            else tmp[i] = 101;
        }
        Arrays.sort(tmp);
        int[] tmps = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < rank.length; j++) {
                if (tmp[i] == rank[j]) {
                    tmps[i] = j;
                }
            }
        }
        answer = (10000 * tmps[0]) + (100 * tmps[1]) + tmps[2];
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false}));
        System.out.println(new Solution().solution(new int[]{1, 2, 3}, new boolean[]{true, true, true}));
        System.out.println(new Solution().solution(new int[]{6, 1, 5, 2, 3, 4}, new boolean[]{true, false, true, false, false, true}));
    }
}