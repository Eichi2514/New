package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Solution.solution(1, 2, 3, 5));
    }
}

class Solution {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max = 0;

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        for (int i = 1; i <= denom && i <= numer; i++) {
            if (numer % i == 0 && denom % i == 0) {
                max = i;
            }
        }

        answer[0] = numer / max;
        answer[1] = denom / max;

        return answer;
    }
}