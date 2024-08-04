package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] a = {"0123456789", "9876543210", "9999999999999"};
        System.out.println(Solution.solution("Progra21Sremm3",6,12));
    }
}

class Solution {
    public static String solution(String my_string, int s, int e) {
        String answer = "";
        String a = my_string.substring(0, s);
        String b = my_string.substring(e+1, my_string.length());
        for (int i = e; i >= s; i--) {
            answer += my_string.charAt(i) + "";
        }
        answer = a + answer + b;
        return answer;
    }
}