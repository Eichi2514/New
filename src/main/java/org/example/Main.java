package org.example;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        Integer[] arr = new Integer[map.size()];
        int index = 0;

        for (int value : map.values()) {
            arr[index++] = value;
        }

        Arrays.sort(arr, (a, b) -> b - a);

        int count = 0;
        int answer = 0;

        for (int a : arr) {
            count += a;
            answer++;
            if (count >= k) {
                break;
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        String[] qwe = {"abc", "cbd", "ddd", "ddd", "dbc", "cbd"};
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