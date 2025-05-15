package programmers.LV0.p181839;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) answer += (a * a) + (b * b);
        else if (a % 2 != 0 || b % 2 != 0) answer += 2 * (a + b);
        else if (a > b) answer += a - b;
        else answer += b - a;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 5));
        System.out.println(new Solution().solution(6, 1));
        System.out.println(new Solution().solution(2, 4));
    }
}
