package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] a = {"0123456789", "9876543210", "9999999999999"};
        System.out.println(Solution.solution("Progra21Sremm3", 2, 3));
    }
}

class Solution {
    public static String solution(String my_string, int m, int c) {
        String answer = "";
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}