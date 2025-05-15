package programmers.LV0.p120831;

class Solution {
    static int solution(int a) {
        int B = 0;
        for (int A = 2; A <= a; ) {
            B = B + A;
            A = A + 2;
        }
        return B;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
        System.out.println(new Solution().solution(4));
    }
}