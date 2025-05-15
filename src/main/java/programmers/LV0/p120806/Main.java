package programmers.LV0.p120806;

class Solution {
    public int solution(int num1, int num2) {
        return num1 * 1000 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 2));
        System.out.println(new Solution().solution(7, 3));
        System.out.println(new Solution().solution(1, 16));
    }
}