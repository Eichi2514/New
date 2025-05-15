package programmers.LV0.p181873;

class Solution {
    public String solution(String my_string, String alp) {
        String big = alp.toUpperCase();
        String answer = my_string.replaceAll(alp, big);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("programmers", "p"));
        System.out.println(new Solution().solution("lowercase", "x"));
    }
}