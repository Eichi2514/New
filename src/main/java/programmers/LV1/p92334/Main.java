package programmers.LV1.p92334;

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
        int[] result1 = new Solution().solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);

        int[] result2 = new Solution().solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}