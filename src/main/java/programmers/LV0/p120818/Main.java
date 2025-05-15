package programmers.LV0.p120818;

class Solution {
    public static int solution(int price) {
        int answer = price;

        if (price >= 500000) {
            answer = price * 80 / 100;
        } else if (price >= 300000) {
            answer = price * 90 / 100;
        } else if (price >= 100000) {
            answer = price * 95 / 100;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(150000));
        System.out.println(new Solution().solution(580000));
    }
}