package org.example;

class Solution{
    public int solution(int n, int a, int b) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if (a % 2 == 0){
                if (a-1 == b) return i;

                a /= 2;

                if (b % 2 == 0) b /= 2;
                else b = (b + 1) / 2;
            } else{
                if (a+1 == b) return i;

                a = (a + 1) / 2;

                if (b % 2 == 0) b /= 2;
                else b = (b + 1) / 2;
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"abc", "cbd", "ddd", "ddd", "dbc", "cbd"};
        // String[] qwe2 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        // String[][] qwe =
        //         {
        //                 {"1", "-1"},
        //                 {"1", "-1"}
        //         };
        //int[] asd = {2,6,8,14};
        //int[] asd2 = {5, 4, 4};
        // boolean[] zxc = {true, false, true};
        // int[][] asd3 = {{1, 5}, {3, 5}};
        // int[][] asd4 = {{3,4}, {5,6}};
/*
        int[] asd = new Solution().solution(3, qwe);
        for (int i = 0; i < asd.length; i++) {
            System.out.println(asd[i]);
        }
 */
//        System.out.println(new Solution().solution(5000));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}