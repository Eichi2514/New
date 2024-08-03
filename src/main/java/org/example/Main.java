package org.example;


public class Main {
    public static void main(String[] args) {
        int[][] a = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(Solution.solution("rermgorpsam", a));
    }
}

class Solution {
    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        String a = "";
        String b = "";
        for (int i = 0; i < queries.length; i++) {
            a = my_string.substring(0, queries[i][0]);
            b = my_string.substring(queries[i][1] + 1, my_string.length());
            for (int j = queries[i][1]; j >= queries[i][0]; j--) {
                answer += my_string.charAt(j);
            }
            my_string = a + answer + b;
            answer = "";
        }
        return my_string;
    }
}