package org.example;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dots = new int[6];
        dots[0] = -5;
        dots[1] = -3;
        dots[2] = -1;
        dots[3] = 1;
        dots[4] = 3;
        dots[5] = 5;
        System.out.println(Solution.solution(dots));
    }
}

class Solution {
    public static int solution(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * common[1] / common[0];
        }
        return answer;
    }
}