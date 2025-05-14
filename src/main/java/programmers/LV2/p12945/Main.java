package programmers.LV2.p12945;

class Solution {
    public long solution(int n) {

        long[] tmp = new long[n + 1];
        tmp[0] = 0;
        tmp[1] = 1;

        for (int i = 2; i <= n; i++) {
            tmp[i] = (tmp[i - 2] + tmp[i - 1]) % 1234567;
        }

        return tmp[n];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3));
        System.out.println(new Solution().solution(5));
    }
}