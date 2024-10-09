package org.example;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] asd = {4, 7, 12};
        // String[] qwe = {"Jane", "Kim"};
        boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution(asd, zxc));
    }
}

