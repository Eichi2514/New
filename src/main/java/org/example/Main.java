package org.example;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] dots = new int[6];
//        dots[0] = -5;
//        dots[1] = -3;
//        dots[2] = -1;
//        dots[3] = 1;
//        dots[4] = 3;
//        dots[5] = 5;
//        System.out.println(Solution.solution(dots));
    }
}

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total/num) - ((num-1)/2);
        for (int i = 0; i < num; i++) {
            answer[i] = start+i;
        }
        return answer;
    }
}