package programmers.LV0.p181924;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int answer;
        for (int i = 0; i < queries.length; i++) {
            answer = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = answer;
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}});

        System.out.println(Arrays.toString(result1));
    }
}