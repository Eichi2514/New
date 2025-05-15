package programmers.LV0.p181903;

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i = r; i < code.length(); i += q) {
            answer += code.charAt(i) + "";
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println(new Solution().solution(1, 0, "programmers"));
    }
}