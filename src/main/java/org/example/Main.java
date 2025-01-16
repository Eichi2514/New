package org.example;

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add(words[0]);
        for (int i = 1; i < words.length; i++){
            int tmp = 1;
            int count = 1;
            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                for(int k = 1; k <= i; k++){
                    if (tmp < n) tmp++;
                    else {
                        count++;
                        tmp = 1;
                    }
                }
                return new int[]{tmp, count};
            }
            for(int j = 0; j < arr.size(); j++){
                if (words[i].equals(arr.get(j))){
                    for(int k = 1; k <= i; k++){
                        if (tmp < n) tmp++;
                        else {
                            count++;
                            tmp = 1;
                        }
                    }
                    return new int[]{tmp, count};
                }
            }
            arr.add(words[i]);
        }
        return new int[] {0, 0};
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
        int[] asd = new Solution().solution(3, qwe);
        for (int i = 0; i < asd.length; i++) {
            System.out.println(asd[i]);
        }
//        System.out.println(new Solution().solution(5000));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}