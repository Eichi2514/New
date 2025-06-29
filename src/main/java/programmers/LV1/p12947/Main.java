package programmers.LV1.p12947;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;
        int sum = 0;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }
        if (x % sum != 0) answer = false;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
        System.out.println(new Solution().solution(12));
        System.out.println(new Solution().solution(11));
        System.out.println(new Solution().solution(13));
    }
}