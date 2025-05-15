package programmers.LV0.p181937;

class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0) answer = 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(98, 2));
        System.out.println(new Solution().solution(34, 3));
    }
}