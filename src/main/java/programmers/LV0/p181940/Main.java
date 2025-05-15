package programmers.LV0.p181940;

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("string", 3));
        System.out.println(new Solution().solution("love", 10));
    }
}