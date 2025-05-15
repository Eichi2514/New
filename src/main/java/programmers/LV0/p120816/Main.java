package programmers.LV0.p120816;

class Solution {
    public static int solution(int slice, int n) {
        int answer = 0;
        while (true) {
            if (n > 0) {
                n -= slice;
                answer++;
            } else break;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7, 10));
        System.out.println(new Solution().solution(4, 12));
    }
}