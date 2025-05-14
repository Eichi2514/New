package programmers.LV1.p12950;

import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] result1 = new Solution().solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}});
        int[][] result2 = new Solution().solution(new int[][]{{1}, {2}}, new int[][]{{3}, {5}});

        System.out.println(Arrays.deepToString(result1));
        System.out.println(Arrays.deepToString(result2));
    }
}