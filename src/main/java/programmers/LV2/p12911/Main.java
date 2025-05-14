package programmers.LV2.p12911;

class Solution {
    public int solution(int n) {
        int tmp = Integer.bitCount(n);

        while (true) {
            n++;
            if (Integer.bitCount(n) == tmp) {
                return n;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(78));
        System.out.println(new Solution().solution(15));
    }
}
