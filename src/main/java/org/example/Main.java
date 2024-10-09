package org.example;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        System.out.println(new Solution().solution(2));
    }
}

class Solution {
    public String solution(int num) {
        String answer = "";
        if (num%2 != 0) answer = "Odd";
        else answer = "Even";
        return answer;
    }
}