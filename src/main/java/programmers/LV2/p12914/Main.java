package programmers.LV2.p12914;

class Solution {
    public int solution(int n) {
        int tmp = 1234567;

        int[] answer = new int[n + 1];

        answer[1] = 1;
        if (n > 1) answer[2] = 2;

        for (int i = 3; i <= n; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % tmp;
        }

        return answer[n];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(4));
        System.out.println(new Solution().solution(3));
    }
}