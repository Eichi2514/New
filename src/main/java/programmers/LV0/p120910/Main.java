package programmers.LV0.p120910;

class Solution {
    public static int solution(int n, int t) {

        for (int i = 0; i < t; i++) {
            n *= 2;
        }
        int answer = n;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 10));
        System.out.println(new Solution().solution(7, 15));
    }
}