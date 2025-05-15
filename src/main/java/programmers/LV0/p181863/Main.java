package programmers.LV0.p181863;

class Solution {
    public String solution(String rny_string) {
        String answer = rny_string.replaceAll("m", "rn");
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("masterpiece"));
        System.out.println(new Solution().solution("programmers"));
        System.out.println(new Solution().solution("jerry"));
        System.out.println(new Solution().solution("burn"));
    }
}