package programmers.LV0.p181895;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                answer.add(arr[j]);
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}}));
    }
}