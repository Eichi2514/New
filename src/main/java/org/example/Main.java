package org.example;

import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int index = map.get(callings[i]);

            String temp = players[index - 1];

            players[index - 1] = callings[i];
            players[index] = temp;

            map.put(callings[i], index - 1);
            map.put(temp, index);
        }
        return players;
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
//        System.out.println(new Solution().solution("...!@BaT#*..y.abcdefghijklm"));
//        System.out.println(new Solution().solution("z-+.^."));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}