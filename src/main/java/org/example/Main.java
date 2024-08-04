package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        int[][] b = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        System.out.println(Solution.solution("banana", "ana"));
    }
}

class Solution {
    public static int solution(String myString, String pat) {
        int answer = 0;
        String[] tmp = new String[myString.length()];
        for (int i = 0; i < myString.length(); i++) {
            tmp[i] = myString.substring(i);
        }
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].startsWith(pat)) {
                answer++;
            }
        }
        return answer;
    }
}