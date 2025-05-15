package programmers.LV0.p181877;

class Solution {
    public String solution(String myString) {
        String answer = myString.toUpperCase();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("aBcDeFg"));
        System.out.println(new Solution().solution("AAA"));
    }
}