package programmers.LV1.p12937;

class Solution {
    public String solution(int num) {
        String answer = "";
        if (num % 2 != 0) answer = "Odd";
        else answer = "Even";
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3));
        System.out.println(new Solution().solution(4));
    }
}