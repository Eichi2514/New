package programmers.LV0.p120822;

class Solution {
    public static String solution(String my_string) {
        String answer = "";

        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("jaron"));
        System.out.println(new Solution().solution("bread"));
    }
}