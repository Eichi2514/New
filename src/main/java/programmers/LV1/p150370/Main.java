package programmers.LV1.p150370;

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        String[] todays = today.split("\\.");

        int year = Integer.parseInt(todays[0]);
        int month = Integer.parseInt(todays[1]);
        int day = Integer.parseInt(todays[2]);

        String[] tmps = {};
        for (int i = 0; i < terms.length; i++) {
            tmps = terms[i].split(" ");
            map.put(tmps[0], Integer.parseInt(tmps[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] tmps2 = privacies[i].split(" ");
            String[] tmp = tmps2[0].split("\\.");

            int year2 = Integer.parseInt(tmp[0]);
            int month2 = Integer.parseInt(tmp[1]);
            int day2 = Integer.parseInt(tmp[2]);

            if (month2 + map.get(tmps2[1]) > 12) {
                year2 += (month2 + map.get(tmps2[1])) / 12;
                month2 = (month2 + map.get(tmps2[1])) % 12;
            } else month2 += map.get(tmps2[1]);

            if (year > year2) answer.add(i + 1);
            else if (year == year2 && month > month2) answer.add(i + 1);
            else if (year == year2 && month == month2 && day >= day2) answer.add(i + 1);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}));
        System.out.println(new Solution().solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}));
    }
}