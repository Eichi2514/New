package programmers.LV1.p82612;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for (int i = 1; i <= count; i++) {
            answer += (price * i);
        }
        if (answer > money) return answer - money;
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 20, 4));
    }
}