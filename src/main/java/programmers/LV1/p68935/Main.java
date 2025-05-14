package programmers.LV1.p68935;

class Solution {
    public int solution(int n) {
        StringBuilder tmp = new StringBuilder();
        while (n > 0) {
            tmp.append(n % 3);
            n /= 3;
        }
        int answer = 0;
        for (int i = 0; i < tmp.length(); i++) {
            answer += (tmp.charAt(i) - '0') * Math.pow(3, tmp.length() - i - 1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(45));
        System.out.println(new Solution().solution(125));
    }
}