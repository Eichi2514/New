package programmers.LV0.p120892;

class Solution {
    public static String solution(String cipher, int code) {
        String answer = "";
        for (int i = code; i <= cipher.length(); i += code) {
            answer += cipher.charAt(i - 1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(new Solution().solution("pfqallllabwaoclk", 2));
    }
}