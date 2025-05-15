package programmers.LV0.p120810;

class Solution {
    public int solution(int num1, int num2) {
        int a = num1 / num2;
        int b = num1 - (num2 * a);
        return b;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 2));
        System.out.println(new Solution().solution(10, 5));
    }
}