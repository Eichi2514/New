package programmers.LV0.p181830;

import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int idx;
        if (arr.length > arr[0].length) idx = arr.length;
        else if (arr.length < arr[0].length) idx = arr[0].length;
        else return arr;
        int[][] answer = new int[idx][idx];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] result1 = new Solution().solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}});
        int[][] result2 = new Solution().solution(new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}});
        int[][] result3 = new Solution().solution(new int[][]{{1, 2}, {3, 4}});

        System.out.println(Arrays.deepToString(result1));
        System.out.println(Arrays.deepToString(result2));
        System.out.println(Arrays.deepToString(result3));
    }
}