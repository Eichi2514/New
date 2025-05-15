package programmers.LV0.p120840;

class Solution {
    public static int solution(int balls, int share) {
        double answer = 1;
        if (balls != share) {
            for (int i = balls; i > balls - share; i--) {
                answer *= i;
            }
            for (int i = share; i > 0; i--) {
                answer /= i;
            }
        }
        return (int) answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 2));
        System.out.println(new Solution().solution(5, 3));
    }
}