package programmers.LV0.p181849;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += num_str.charAt(i) - '0';
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("123456789"));
        System.out.println(new Solution().solution("1000000"));
    }
}