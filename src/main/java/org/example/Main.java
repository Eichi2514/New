package org.example;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        System.out.println(new Solution().solution(123));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}