package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] a = {"0123456789", "9876543210", "9999999999999"};
        System.out.println(Solution.solution("A"));
    }
}

class Solution {
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            int index = my_string.charAt(i);
            if (index > 115) answer[index-65]++;
            else if (index < 120) answer[index-71]++;
        }
        return answer;
    }
}