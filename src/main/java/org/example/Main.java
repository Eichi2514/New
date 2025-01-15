package org.example;

class Solution {
    public long solution(int n) {

        long[] tmp = new long[n + 1];
        tmp[0] = 0;
        tmp[1] = 1;

        for (int i = 2; i <= n; i++) {
            tmp[i] = (tmp[i - 2] + tmp[i - 1]) % 1234567;
        }

        return tmp[n];
    }
}



public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"muzi", "ryan", "frodo", "neo"};
        // String[] qwe2 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        // String[][] qwe =
        //         {
        //                 {"1", "-1"},
        //                 {"1", "-1"}
        //         };
        //int[] asd = {1, 4, 2};
        //int[] asd2 = {5, 4, 4};
        // boolean[] zxc = {true, false, true};
        // int[][] asd3 = {{1, 5}, {3, 5}};
        // int[][] asd4 = {{3,4}, {5,6}};
//        int[] asd = new Solution().solution(qwe, qwe2, 2);
//        for (int i = 0; i < asd.length; i++) {
//            System.out.println(asd[i]);
//        }
        System.out.println(new Solution().solution(15));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}