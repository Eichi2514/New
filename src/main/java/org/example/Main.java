package org.example;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        System.out.println(new Solution().solution(2, 5));
    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}