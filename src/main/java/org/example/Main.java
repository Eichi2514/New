package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution("asDDd"));
    }
}

class Solution {
    public static String solution(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        String answer = "";
        for (int i = 0; i < chars.length; i++) {
            answer += chars[i];
        }
        return answer;
    }
}