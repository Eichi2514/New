package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] a = {"0123456789","9876543210","9999999999999"};
        System.out.println(Solution.solution("123456789"));
    }
}

class Solution {
    public static int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += num_str.charAt(i) - '0';
        }
        return answer;
    }
}