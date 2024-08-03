package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] a = {"0123456789","9876543210","9999999999999"};
        System.out.println(Solution.solution(3));
    }
}

class Solution {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}