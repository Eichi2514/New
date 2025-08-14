package programmers.LV2.p17680;

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cs = new LinkedList<>();

        for (String city : cities) {
            city = city.toLowerCase();

            if (cs.contains(city)) {
                cs.remove(city);
                cs.addFirst(city);
                answer++;
            } else {
                if (cacheSize > 0) {
                    if (cs.size() == cacheSize) {
                        cs.removeLast();
                    }
                    cs.addFirst(city);
                }
                answer += 5;
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        System.out.println(new Solution().solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        System.out.println(new Solution().solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(new Solution().solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(new Solution().solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
        System.out.println(new Solution().solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}