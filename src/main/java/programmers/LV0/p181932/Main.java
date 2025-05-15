package programmers.LV0.p181932;

class Solution {
    public String solution(String code) {
        String answer = "";
        int mod = 0;
        for (int i = 0; i < code.length(); i++) {
            if (mod == 0) {
                if (code.charAt(i) == '1') {
                    mod = 1;
                } else if (i % 2 == 0) answer += code.charAt(i);
            } else if (mod == 1) {
                if (code.charAt(i) == '1') {
                    mod = 0;
                } else if (i % 2 != 0) answer += code.charAt(i);
            }
        }
        if (answer.equals("")) return "EMPTY";
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abc1abc1abc"));
    }
}