package org.example;

public class Main {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        System.out.println(new Solution().solution("pPoooyY"));
    }
}

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int Pcount = 0;
        int Ycount = 0;
        String[] tmps = s.split("");
        for (int i = 0; i < tmps.length; i++) {
            if (tmps[i].equals("P") || tmps[i].equals("p")) Pcount++;
            else if (tmps[i].equals("Y") || tmps[i].equals("y")) Ycount++;
        }
        if (Pcount != Ycount) answer = false;
        return answer;
    }
}