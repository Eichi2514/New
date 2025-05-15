package programmers.LV0.p120814;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        while (true) {
            if (n > 0) {
                n -= 7;
                answer++;
            } else break;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7));
        System.out.println(new Solution().solution(1));
        System.out.println(new Solution().solution(15));
    }
}