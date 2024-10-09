package org.example;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        System.out.println(new Solution().solution(12));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }
}