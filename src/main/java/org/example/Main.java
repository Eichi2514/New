package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] a = {"0123456789","9876543210","9999999999999"};
        System.out.println(Solution.solution(a,50000,5,5));
    }
}

class Solution {
    public static ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < intStrs.length; i++) {
            if (Integer.parseInt(intStrs[i].substring(s, s + l)) > k)answer.add(Integer.parseInt(intStrs[i].substring(s, s + l)));
        }
        return answer;
    }
}