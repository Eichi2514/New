package programmers.LV0.p181922;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) arr[j]++;
            }
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}});

        System.out.println(Arrays.toString(result1));
    }
}