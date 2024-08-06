package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] a = {5, 4, 3, 2, 1, 0};
//        int[] b = {4, 1, 2};
        System.out.println(Solution.solution(9));
    }
}

class Solution {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0;
        int y = -1;
        for (int i = 0; i < n; i++) {
            y++;
            answer[x][y] = num;
            num++;
        }
        while (n > 1) {
            n--;
            for (int i = 0; i < n; i++) {
                x++;
                answer[x][y] = num;
                num++;
            }
            for (int i = 0; i < n; i++) {
                y--;
                answer[x][y] = num;
                num++;
            }
            n--;
            for (int i = 0; i < n; i++) {
                x--;
                answer[x][y] = num;
                num++;
            }
            for (int i = 0; i < n; i++) {
                y++;
                answer[x][y] = num;
                num++;
            }
        }
        return answer;
    }
}