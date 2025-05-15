package programmers.LV0.p181865;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] tmp = binomial.split(" ");
        if (tmp[1].equals("+")) {
            answer = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
        } else if (tmp[1].equals("-")) {
            answer = Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
        } else if (tmp[1].equals("*")) {
            answer = Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[2]);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("43 + 12"));
        System.out.println(new Solution().solution("0 - 7777"));
        System.out.println(new Solution().solution("40000 * 40000"));
    }
}