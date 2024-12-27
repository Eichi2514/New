package org.example;

import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;

        Arrays.sort(mats);

        for (int i = mats.length - 1; i >= 0; i--) {
            for (int j = 0; j <= park.length - mats[i]; j++) {
                for (int k = 0; k <= park[j].length - mats[i]; k++) {
                    boolean tmp = true;
                    for (int l = j; l < j + mats[i]; l++) {
                        for (int m = k; m < k + mats[i]; m++) {
                            if (!park[l][m].equals("-1")) {
                                tmp = false;
                                break;
                            }
                        }
                        if (!tmp) break;
                    }
                    if (tmp) return mats[i];
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"SOO","OXX","OOO"};
        // String[] qwe2 = {"E 2","S 2","W 1"};
        String[][] qwe =
                {
                        {"1", "-1"},
                        {"1", "-1"}
                };
        int[] asd = {1};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        // int[][] asd3 = {{1,2}, {2,3}};
        // int[][] asd4 = {{3,4}, {5,6}};
        // int[] asd = new Solution().solution(qwe,qwe2);
//         for (int i = 0; i < asd.length; i++) {
//             System.out.println(asd[i]);
//         }
          System.out.println(new Solution().solution(asd, qwe));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}