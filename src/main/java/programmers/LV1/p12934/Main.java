package programmers.LV1.p12934;

class Solution {
    public static long solution(long n) {
        for (long a = 1; a <= n; a++) {
            if (a * a == n) {
                return (a + 1) * (a + 1);
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(121));
        System.out.println(new Solution().solution(3));
    }
}