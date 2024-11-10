package org.example;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNumber = Long.parseLong(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long tNumber = Long.parseLong(t.substring(i, i + p.length()));
            System.out.println("tNumber : " + tNumber);
            if (tNumber <= pNumber) {
                answer++;
            }
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
        System.out.println(new Solution().solution("3141592", "271"));
    }
}

