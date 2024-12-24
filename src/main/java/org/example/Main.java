package org.example;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int a = 50;
        int b = 50;
        int c = 0;
        int d = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (a > i) a = i;
                    if (b > j) b = j;
                    if (c < i) c = i;
                    if (d < j) d = j;
                }
            }
        }
        answer = new int[] {a, b, c+1, d+1};
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