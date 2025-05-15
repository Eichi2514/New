package programmers.LV0.p181930;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        if (a == b || a == c || b == c) answer *= (a * a) + (b * b) + (c * c);
        if (a == b && b == c) answer *= (a * a * a) + (b * b * b) + (c * c * c);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 6, 1));
        System.out.println(new Solution().solution(5, 3, 3));
        System.out.println(new Solution().solution(4, 4, 4));
    }
}