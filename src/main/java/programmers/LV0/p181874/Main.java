package programmers.LV0.p181874;

class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        String answer = myString.replaceAll("a", "A");
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abstract algebra"));
        System.out.println(new Solution().solution("PrOgRaMmErS"));
    }
}