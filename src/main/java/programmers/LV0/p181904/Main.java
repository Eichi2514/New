package programmers.LV0.p181904;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i) + "";
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(new Solution().solution("programmers", 1, 1));
    }
}