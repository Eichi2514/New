package programmers.LV0.p181935;

class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        } else for (int i = 1; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7));
        System.out.println(new Solution().solution(10));
    }
}