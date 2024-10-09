package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        System.out.println(new Solution().solution(12345));
    }
}

class Solution {
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();
        while (n > 0) {
            answer.add(n % 10);
            n /= 10;
        }
        return answer;
    }
}