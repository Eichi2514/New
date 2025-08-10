package programmers.LV2.p131127;

import java.util.*;

class Solution {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int n = discount.length;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        Map<String, Integer> windowMap = new HashMap<>();

        for (int i = 0; i < 10 && i < n; i++) {
            windowMap.put(discount[i], windowMap.getOrDefault(discount[i], 0) + 1);
        }

        if (matches(wantMap, windowMap)) answer++;

        for (int i = 10; i < n; i++) {
            String removeItem = discount[i - 10];
            String addItem = discount[i];

            windowMap.put(removeItem, windowMap.get(removeItem) - 1);
            if (windowMap.get(removeItem) == 0) {
                windowMap.remove(removeItem);
            }

            windowMap.put(addItem, windowMap.getOrDefault(addItem, 0) + 1);

            if (matches(wantMap, windowMap)) answer++;
        }

        return answer;
    }

    private static boolean matches(Map<String, Integer> wantMap, Map<String, Integer> windowMap) {
        for (String key : wantMap.keySet()) {
            if (windowMap.getOrDefault(key, 0) != wantMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
        System.out.println(Solution.solution(new String[]{"apple"}, new int[]{10}, new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}));
    }
}