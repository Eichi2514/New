package programmers.LV1.p155652;

class Solution {
    public static String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char S = s.charAt(i);
            for (int j = 0; j < index; j++) {
                S++;
                if (S > 'z') {
                    S = 'a';
                }
                boolean temp = false;
                for (int k = 0; k < skip.length(); k++) {
                    if (S == skip.charAt(k)) {
                        temp = true;
                        break;
                    }
                }
                if (temp) {
                    j--;
                }
            }
            answer += S;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("aukks", "wbqd", 5));
    }
}