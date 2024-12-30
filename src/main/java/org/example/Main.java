package org.example;

import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> friendMap = new HashMap<>();
        HashMap<String, Integer> giftMap = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            friendMap.put(friends[i], 0);
        }

        for (int i = 0; i < gifts.length; i++) {
            int giftsCount = 1;

            if (giftMap.get(gifts[i]) != null) giftsCount = giftMap.get(gifts[i]) + 1;
            giftMap.put(gifts[i], giftsCount);

            String[] tmps = gifts[i].split(" ");
            friendMap.put(tmps[0], friendMap.get(tmps[0]) + 1);
            friendMap.put(tmps[1], friendMap.get(tmps[1]) - 1);
        }

        HashMap<String, Integer> answerMap = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                String StrIndex1 = friends[i] + " " + friends[j];
                String StrIndex2 = friends[j] + " " + friends[i];

                if (i != j) {
                    if (giftMap.get(StrIndex1) != null && giftMap.get(StrIndex2) != null) {
                        if (giftMap.get(StrIndex1) > giftMap.get(StrIndex2)) {
                            int count = 0;
                            if (answerMap.get(friends[i]) != null) count = answerMap.get(friends[i]);
                            answerMap.put(friends[i], count + 1);
                        } else if (giftMap.get(StrIndex1) == giftMap.get(StrIndex2)) {
                            if (friendMap.get(friends[i]) > friendMap.get(friends[j])) {
                                int count = 0;
                                if (answerMap.get(friends[i]) != null) count = answerMap.get(friends[i]);
                                answerMap.put(friends[i], count + 1);
                            }
                        }
                    } else if (giftMap.get(StrIndex1) != null) {
                        int count = 0;
                        if (answerMap.get(friends[i]) != null) count = answerMap.get(friends[i]);
                        answerMap.put(friends[i], count + 1);
                    } else if (giftMap.get(StrIndex1) == null && giftMap.get(StrIndex2) == null) {
                        if (friendMap.get(friends[i]) > friendMap.get(friends[j])) {
                            int count = 0;
                            if (answerMap.get(friends[i]) != null) count = answerMap.get(friends[i]);
                            answerMap.put(friends[i], count + 1);
                        }
                    }
                }
            }
        }

        if (answerMap.size() == 0) return 0;

        int answer = 0;

        for (int i = 0; i < friends.length; i++) {
            if (answerMap.get(friends[i]) != null) {
                if (answer < answerMap.get(friends[i])) answer = answerMap.get(friends[i]);
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        String[] qwe = {"muzi", "ryan", "frodo", "neo"};
        String[] qwe2 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        // String[][] qwe =
        //         {
        //                 {"1", "-1"},
        //                 {"1", "-1"}
        //         };
        // int[] asd = {3, 10, 1};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        // int[][] asd3 = {{1, 5}, {3, 5}};
        // int[][] asd4 = {{3,4}, {5,6}};
//        int[] asd = new Solution().solution(qwe, qwe2, 2);
//        for (int i = 0; i < asd.length; i++) {
//            System.out.println(asd[i]);
//        }
        System.out.println(new Solution().solution(qwe, qwe2));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}