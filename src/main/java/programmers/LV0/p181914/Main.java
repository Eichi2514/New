package programmers.LV0.p181914;

class Solution {
    public static int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - 48;
        }
        answer = answer % 9;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("123"));
        System.out.println(new Solution().solution("78720646226947352489"));
    }
}