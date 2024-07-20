package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] dots = new int[5][5];
        dots[0][0] = 0;
        dots[0][1] = 0;
        dots[0][2] = 0;
        dots[0][3] = 0;
        dots[0][4] = 0;
        dots[1][0] = 0;
        dots[1][1] = 0;
        dots[1][2] = 0;
        dots[1][3] = 0;
        dots[1][4] = 0;
        dots[2][0] = 0;
        dots[2][1] = 0;
        dots[2][2] = 0;
        dots[2][3] = 0;
        dots[2][4] = 0;
        dots[3][0] = 0;
        dots[3][1] = 0;
        dots[3][2] = 0;
        dots[3][3] = 0;
        dots[3][4] = 0;
        System.out.println(Solution.solution(dots));
    }
}

class Solution {
    public static int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    if (i > 0 && j > 0) {
                        if (board[i - 1][j - 1] == 0) board[i - 1][j - 1] = 2;
                    }
                    if (i > 0) {
                        if (board[i - 1][j] == 0) board[i - 1][j] = 2;
                    }
                    if (i > 0 && j < board.length-1) {
                        if (board[i - 1][j + 1] == 0) board[i - 1][j + 1] = 2;
                    }
                    if (j > 0) {
                        if (board[i][j - 1] == 0) board[i][j - 1] = 2;
                    }
                    if (j < board.length-1) {
                        if (board[i][j + 1] == 0) board[i][j + 1] = 2;
                    }
                    if (j > 0 && i < board.length-1) {
                        if (board[i + 1][j - 1] == 0) board[i + 1][j - 1] = 2;
                    }
                    if (i < board.length-1) {
                        if (board[i + 1][j] == 0) board[i + 1][j] = 2;
                    }
                    if (i < board.length-1 && j < board.length-1) {
                        if (board[i + 1][j + 1] == 0) board[i + 1][j + 1] = 2;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}