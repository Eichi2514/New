package org.example;

import java.util.HashMap;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int w = 0;
        int h = 0;
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    h = i;
                    w = j;
                    break;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            boolean tmp = true;
            if (routes[i].charAt(0) == 'E') {
                for (int j = w; j < Integer.parseInt(String.valueOf(routes[i].charAt(2))); j++) {
                    if (park[h].charAt(j) == 'X') {
                        tmp = false;
                    }
                }
                if (tmp && w + Integer.parseInt(String.valueOf(routes[i].charAt(2))) < park[0].length()) {
                    w += Integer.parseInt(String.valueOf(routes[i].charAt(2)));
                }
            } else if (routes[i].charAt(0) == 'W') {
                for (int j = w; j >= Integer.parseInt(String.valueOf(routes[i].charAt(2))); j--) {
                    if (park[h].charAt(j) == 'X') {
                        tmp = false;
                    }
                }
                if (tmp && w - Integer.parseInt(String.valueOf(routes[i].charAt(2))) >= 0) {
                    w -= Integer.parseInt(String.valueOf(routes[i].charAt(2)));
                }
            } else if (routes[i].charAt(0) == 'S') {
                for (int j = h; j < Integer.parseInt(String.valueOf(routes[i].charAt(2))); j++) {
                    if (park[j].charAt(w) == 'X') {
                        tmp = false;
                    }
                }
                if (tmp && h + Integer.parseInt(String.valueOf(routes[i].charAt(2))) < park.length) {
                    h += Integer.parseInt(String.valueOf(routes[i].charAt(2)));
                }
            } else if (routes[i].charAt(0) == 'N') {
                for (int j = h; j >= Integer.parseInt(String.valueOf(routes[i].charAt(2))); j--) {
                    if (park[j].charAt(w) == 'X') {
                        tmp = false;
                    }
                }
                if (tmp && h - Integer.parseInt(String.valueOf(routes[i].charAt(2))) >= 0) {
                    h -= Integer.parseInt(String.valueOf(routes[i].charAt(2)));
                }
            }
        }

        int[] answer = {h, w};
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] qwe = {"SOO","OXX","OOO"};
        String[] qwe2 = {"E 2","S 2","W 1"};
        // int[] asd = {1, 2, 3, 4};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        // int[][] asd3 = {{1,2}, {2,3}};
        // int[][] asd4 = {{3,4}, {5,6}};
        int[] asd = new Solution().solution(qwe,qwe2);
        for (int i = 0; i < asd.length; i++) {
            System.out.println(asd[i]);
        }
//        System.out.println(new Solution().solution("z-+.^."));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}