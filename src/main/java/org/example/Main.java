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
//        System.out.println(Solution.solution(dots));
    }
}

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if (Math.abs((dots[0][1] - dots[1][1]) * (dots[2][0] - dots[3][0])) == Math.abs((dots[2][1] - dots[3][1]) * (dots[0][0] - dots[1][0])))
            return 1;
        if (Math.abs((dots[0][1] - dots[2][1]) * (dots[1][0] - dots[3][0])) == Math.abs((dots[1][1] - dots[3][1]) * (dots[0][0] - dots[2][0])))
            return 1;
        if (Math.abs((dots[0][1] - dots[3][1]) * (dots[1][0] - dots[2][0])) == Math.abs((dots[1][1] - dots[2][1]) * (dots[0][0] - dots[3][0])))
            return 1;
        return answer;
    }
}