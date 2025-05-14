package programmers.LV2.p12951;

class Solution {
    public static String solution(String s) {
        String answer = "";
        String tmp = " " + s;

        for (int i = 1; i <= s.length(); i++) {
            if (tmp.charAt(i-1) == ' '){
                String t = tmp.charAt(i) + "";
                answer += t.toUpperCase();
            } else {
                String t = tmp.charAt(i) + "";
                answer += t.toLowerCase();
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("3people unFollowed me"));
        System.out.println(new Solution().solution("for the last week"));
    }
}