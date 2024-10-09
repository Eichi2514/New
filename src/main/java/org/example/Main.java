package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(10));
    }
}

class Solution {
    public static int solution(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}