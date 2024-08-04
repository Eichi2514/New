package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        System.out.println(Solution.solution(b, 2));
    }
}

class Solution {
    public static int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) answer += board[i][j];
            }
        }
        return answer;
    }
}