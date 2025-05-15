package programmers.LV0.p120956;

class Solution {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] bab = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < bab.length; j++) {
                if (babbling[i].contains(bab[j])) {
                    babbling[i] = babbling[i].replace(bab[j], " ");
                }
            }
        }
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].trim();
            if (babbling[i].equals("")) answer++;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(new Solution().solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}