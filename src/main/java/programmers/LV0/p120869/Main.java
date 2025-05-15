package programmers.LV0.p120869;

import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String tmp = "";
        Arrays.sort(spell);
        for (int i = 0; i < spell.length; i++) {
            tmp += spell[i];
        }
        for (int i = 0; i < dic.length; i++) {
            String[] tmps = dic[i].split("");
            Arrays.sort(tmps);
            dic[i] = "";
            for (int j = 0; j < tmps.length; j++) {
                dic[i] += tmps[j];
            }
            if (tmp.equals(dic[i])) {
                answer = 1;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(new Solution().solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(new Solution().solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }
}