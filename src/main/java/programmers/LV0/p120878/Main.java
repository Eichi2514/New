package programmers.LV0.p120878;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        while (b % 2 == 0 || b % 5 == 0) {
            if (b % 2 == 0) b /= 2;
            else if (b % 5 == 0) b /= 5;
        }
        if (a % b == 0) answer = 1;
        else answer = 2;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7, 20));
        System.out.println(new Solution().solution(11, 22));
        System.out.println(new Solution().solution(12, 21));
    }
}