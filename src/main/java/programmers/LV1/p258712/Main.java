package programmers.LV1.p258712;

import java.util.*;

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
        System.out.println(new Solution().solution(new String[]{"muzi", "ryan", "frodo", "neo"}, new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}));
        System.out.println(new Solution().solution(new String[]{"joy", "brad", "alessandro", "conan", "david"}, new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"}));
        System.out.println(new Solution().solution(new String[]{"a", "b", "c"}, new String[]{"a b", "b a", "c a", "a c", "a c", "c a"}));
    }
}