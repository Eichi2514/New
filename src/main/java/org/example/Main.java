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
        System.out.println(Solution.solution(3, 2));
    }
}

class Solution {
    public static int solution(int balls, int share) {
        double answer = 1;
        if (balls != share) {
            for (int i = balls; i > balls - share; i--) {
                answer *= i;
            }
            for (int i = share; i > 0; i--) {
                answer /= i;
            }
        }
        return (int) answer;
    }
}