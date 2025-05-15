package programmers.LV0.p120846;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                } else if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
        System.out.println(new Solution().solution(15));
    }
}