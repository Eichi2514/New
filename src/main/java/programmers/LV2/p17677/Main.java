package programmers.LV2.p17677;

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> multiset1 = makeMultiset(str1);
        Map<String, Integer> multiset2 = makeMultiset(str2);

        int intersection = 0;
        int union = 0;

        for (String key : multiset1.keySet()) {
            if (multiset2.containsKey(key)) {
                intersection += Math.min(multiset1.get(key), multiset2.get(key));
            }
        }

        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(multiset1.keySet());
        allKeys.addAll(multiset2.keySet());

        for (String key : allKeys) {
            int count1 = multiset1.getOrDefault(key, 0);
            int count2 = multiset2.getOrDefault(key, 0);
            union += Math.max(count1, count2);
        }

        double similarity = union == 0 ? 1 : (double) intersection / union;

        return (int) (similarity * 65536);
    }

    private Map<String, Integer> makeMultiset(String str) {
        Map<String, Integer> map = new HashMap<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                String pair = "" + a + b;
                map.put(pair, map.getOrDefault(pair, 0) + 1);
            }
        }
        return map;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("FRANCE", "french"));
        System.out.println(sol.solution("handshake", "shake hands"));
        System.out.println(sol.solution("aa1+aa2", "AAAA12"));
        System.out.println(sol.solution("E=M*C^2", "e=m*c^2"));
    }
}