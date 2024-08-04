package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 0, 0, 1};
        System.out.println(Solution.solution("1 + 1"));
    }
}

class Solution {
    public static int solution(String binomial) {
        int answer = 0;
        String[] tmp = binomial.split(" ");
        if (tmp[1].equals("+")) {
            answer = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
        } else if (tmp[1].equals("-")) {
            answer = Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
        } else if (tmp[1].equals("*")) {
            answer = Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[2]);
        }
        return answer;
    }
}