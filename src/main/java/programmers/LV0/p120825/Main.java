package programmers.LV0.p120825;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello", 3));
    }
}