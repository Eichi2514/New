package programmers.LV0.p120898;

class Solution {
    public static int solution(String message) {
        return message.length() * 2;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("happy birthday!"));
        System.out.println(new Solution().solution("I love you~"));
    }
}