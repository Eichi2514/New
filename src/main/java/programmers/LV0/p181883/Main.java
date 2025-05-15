package programmers.LV0.p181883;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}});

        System.out.println(Arrays.toString(result1));
    }
}