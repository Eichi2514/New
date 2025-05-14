package programmers.LV1.p132267;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int exchanged = (n / a) * b;
            answer += exchanged;
            n = exchanged + (n % a);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 1, 20));
        System.out.println(new Solution().solution(3, 1, 20));
    }
}