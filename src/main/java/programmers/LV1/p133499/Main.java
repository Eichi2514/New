package programmers.LV1.p133499;

class Solution {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] answers = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String a = "";

            while (!babbling[i].isEmpty()) {
                boolean b = false;
                for (int j = 0; j < answers.length; j++) {
                    if (babbling[i].startsWith(answers[j]) && !answers[j].equals(a)) {
                        babbling[i] = babbling[i].substring(answers[j].length());
                        a = answers[j];
                        b = true;
                        break;
                    }
                }

                if (!b) {
                    break;
                }
            }

            if (babbling[i].isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(new Solution().solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}