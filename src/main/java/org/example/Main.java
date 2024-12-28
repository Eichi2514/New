package org.example;

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Set<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> reportedCountMap = new HashMap<>();

        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
        }

        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            reportMap.get(reporter).add(reported);
        }

        for (Set<String> reportedSet : reportMap.values()) {
            for (String reported : reportedSet) {
                reportedCountMap.put(reported, reportedCountMap.getOrDefault(reported, 0) + 1);
            }
        }

        HashSet<String> suspendedUsers = new HashSet<>();
        for (String user : reportedCountMap.keySet()) {
            if (reportedCountMap.get(user) >= k) {
                suspendedUsers.add(user);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            int mailCount = 0;

            for (String reported : reportMap.get(user)) {
                if (suspendedUsers.contains(reported)) {
                    mailCount++;
                }
            }
            answer[i] = mailCount;
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        String[] qwe = {"muzi", "frodo", "apeach", "neo"};
        String[] qwe2 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        // String[][] qwe =
        //         {
        //                 {"1", "-1"},
        //                 {"1", "-1"}
        //         };
        // int[] asd = {1};
        // int[] asd2 = {-3, -1, 0, 2};
        // boolean[] zxc = {true, false, true};
        // int[][] asd3 = {{1,2}, {2,3}};
        // int[][] asd4 = {{3,4}, {5,6}};
        int[] asd = new Solution().solution(qwe, qwe2, 2);
        for (int i = 0; i < asd.length; i++) {
            System.out.println(asd[i]);
        }
//        System.out.println(new Solution().solution(asd, qwe));
//        System.out.println(new Solution().solution("=.="));
//        System.out.println(new Solution().solution("123_.def"));
//        System.out.println(new Solution().solution("abcdefghijklmn.p"));
    }
}