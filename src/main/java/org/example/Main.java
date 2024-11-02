package org.example;

class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++){
            if(i%2 == 1) answer += "수";
            else answer += "박";
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        // int[] asd = {1, 2, 3, 4};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution(3));
    }
}

