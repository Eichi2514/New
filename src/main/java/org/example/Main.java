package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 4;
        numbers[3] = 6;
//        numbers[4] = 10;
//        numbers[5] = 4;
//        numbers[6] = 1;
//        numbers[7] = 1;
//        numbers[8] = 1;
//        numbers[9] = 1;
        System.out.println(Solution.solution(2,10));
    }
}

class Solution {
    public static int solution(int n, int t) {

        for (int i = 0; i < t; i++) {
            n *=2;
        }
        int answer = n;

        return answer;
    }
}