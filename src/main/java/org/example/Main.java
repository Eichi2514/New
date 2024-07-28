package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution("He11oWor1d", "lloWorl", 2));
    }
}

class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;
        if (my_string.length() > overwrite_string.length()) {
            answer = answer+my_string.substring(overwrite_string.length()+s);
        }
        return answer;
    }
}