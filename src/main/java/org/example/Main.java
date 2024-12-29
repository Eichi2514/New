package org.example;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int count = 0;
        int time = 0;
        int index = 0;

        while (answer >= 0 && index < attacks.length) {
            count++;
            time++;
            if (time == attacks[index][0]) {
                answer -= attacks[index][1];
                index++;
                count = 0;
            } else {
                if (answer + bandage[1] < health) answer += bandage[1];
                else answer = health;
                if (count == bandage[0]) {
                    count = 0;
                    if (answer + bandage[2] < health) {
                        answer += bandage[2];
                    } else {
                        answer = health;
                    }
                }
            }
        }
        if (answer <= 0) return -1;
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        // String[] qwe = {"muzi", "frodo", "apeach", "neo"};
        // String[] qwe2 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        // String[][] qwe =
        //         {
        //                 {"1", "-1"},
        //                 {"1", "-1"}
        //         };
        int[] asd = {3, 10, 1};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        int[][] asd3 = {{1, 5}, {3, 5}};
        // int[][] asd4 = {{3,4}, {5,6}};
//        int[] asd = new Solution().solution(qwe, qwe2, 2);
//        for (int i = 0; i < asd.length; i++) {
//            System.out.println(asd[i]);
//        }
        System.out.println(new Solution().solution(asd, 100, asd3));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}