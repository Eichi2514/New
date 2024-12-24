package org.example;

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        String[] todays = today.split("\\.");

        int year = Integer.parseInt(todays[0]);
        int month = Integer.parseInt(todays[1]);
        int day = Integer.parseInt(todays[2]);

        String[] tmps = {};
        for (int i = 0; i < terms.length; i++) {
            tmps = terms[i].split(" ");
            map.put(tmps[0], Integer.parseInt(tmps[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] tmps2 = privacies[i].split(" ");
            String[] tmp = tmps2[0].split("\\.");

            int year2 = Integer.parseInt(tmp[0]);
            int month2 = Integer.parseInt(tmp[1]);
            int day2 = Integer.parseInt(tmp[2]);

            if (month2 + map.get(tmps2[1]) > 12) {
                year2 += (month2 + map.get(tmps2[1]) - 1) / 12;
                month2 = (month2 + map.get(tmps2[1]) - 1) % 12 + 1;
            } else month2 += map.get(tmps2[1]);

            if (year > year2) answer.add(i + 1);
            else if (year == year2 && month > month2) answer.add(i + 1);
            else if (year == year2 && month == month2 && day >= day2) answer.add(i + 1);
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
//        System.out.println(new Solution().solution("...!@BaT#*..y.abcdefghijklm"));
//        System.out.println(new Solution().solution("z-+.^."));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}