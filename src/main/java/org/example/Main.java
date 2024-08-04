package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(Solution.solution("apporoograpemmemprs", a));
    }
}

class Solution {
    public static String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }
        for (int i = 0; i < tmp.length; i++) {
            answer += tmp[i];
        }
        return answer;
    }
}