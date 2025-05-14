package programmers.LV1.p12943;

class Solution {
    public int solution(int num) {
        int answer = 0;
        long num2 = num;
        while (num2 != 1) {
            answer++;
            if (num2 % 2 == 0) num2 /= 2;
            else num2 = (num2 * 3) + 1;
            if (answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(6));
        System.out.println(new Solution().solution(16));
        System.out.println(new Solution().solution(626331));
    }
}