package org.example;

class Solution {
    public int solution(int n) {
        StringBuilder tmp = new StringBuilder();
        while (n > 0) {
            tmp.append(n % 3);
            n /= 3;
        }
        int answer = 0;
        for (int i = 0; i < tmp.length(); i++) {
            answer += (int) ((tmp.charAt(i) - '0') * Math.pow(3, tmp.length()-i-1));
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
        // int[][] asd3 = {{1,2}, {2,3}};
        // int[][] asd4 = {{3,4}, {5,6}};
        System.out.println(new Solution().solution(45));
    }
}

