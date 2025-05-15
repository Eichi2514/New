package programmers.LV0.p120848;

class Solution {
    public static int solution(int n) {
        int answer = 1;
        int pt = 1;
        for (int i = 1; i <= 10; i++) {
            pt *= i;
            if (pt <= n) answer = i;

        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3628800));
        System.out.println(new Solution().solution(7));
    }
}