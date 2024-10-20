package org.example;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"Jane", "Kim"};
        int[] asd = {1, 2, 3, 4};
        int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        System.out.println(new Solution().solution(asd, asd2));
    }
}

