package programmers.LV0.p181923;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int min = -1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (min == -1 && arr[j] > queries[i][2]) {
                    min = arr[j];
                }
                if (arr[j] > queries[i][2] && arr[j] < min) {
                    min = arr[j];
                }
            }
            answer[i] = min;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] result1 = new Solution().solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}});

        System.out.println(Arrays.toString(result1));
    }
}