package org.example;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max;
        int min;
        if (a > b) {
            max = a;
            min = b;
        }else {
            max = b;
            min = a;
        }
        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        System.out.println(new Solution().solution(3, 5));
        System.out.println(new Solution().solution(3, 3));
        System.out.println(new Solution().solution(5, 3));
    }
}

