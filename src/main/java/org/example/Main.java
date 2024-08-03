package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] a = {"0123456789", "9876543210", "9999999999999"};
        System.out.println(Solution.solution(3, 5));
    }
}

class Solution {
    public static int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) answer += (a * a) + (b * b);
        else if (a % 2 != 0 || b % 2 != 0) answer += 2 * (a + b);
        else if (a > b) answer += a - b;
        else answer += b - a;
        return answer;
    }
}