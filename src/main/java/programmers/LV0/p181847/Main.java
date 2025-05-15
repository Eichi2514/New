package programmers.LV0.p181847;

class Solution {
    public String solution(String n_str) {
        int tmp = Integer.parseInt(n_str);
        String answer = Integer.toString(tmp);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("0010"));
        System.out.println(new Solution().solution("854020"));
    }
}