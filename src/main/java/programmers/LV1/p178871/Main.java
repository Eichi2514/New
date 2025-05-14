package programmers.LV1.p178871;

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int index = map.get(callings[i]);

            String temp = players[index - 1];

            players[index - 1] = callings[i];
            players[index] = temp;

            map.put(callings[i], index - 1);
            map.put(temp, index);
        }
        return players;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] result1 = new Solution().solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});

        System.out.println(Arrays.toString(result1));
    }
}