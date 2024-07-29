package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 2, 1, 7, 5};
        System.out.println(Solution.solution("banana", "nan"));
    }
}

class Solution {
    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        int count = 0;
        if (my_string.length() > is_prefix.length()) {
            for (int i = 0; i < is_prefix.length(); i++) {
                if (my_string.charAt(i) == is_prefix.charAt(i)) {
                    count++;
                }
            }
        }
        if (count == is_prefix.length()) answer = 1;
        return answer;
    }
}