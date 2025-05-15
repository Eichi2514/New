package programmers.LV0.p120836;

class Solution {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(20));
        System.out.println(new Solution().solution(100));
    }
}