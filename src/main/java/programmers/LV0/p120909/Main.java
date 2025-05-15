package programmers.LV0.p120909;

class Solution {
    public int solution(int n) {
        int answer = 2;

        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n) answer = 1;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(144));
        System.out.println(new Solution().solution(976));
    }
}