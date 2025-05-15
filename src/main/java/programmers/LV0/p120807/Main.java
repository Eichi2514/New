package programmers.LV0.p120807;

class Solution {
    public int solution(int num1, int num2) {
        int i = 0;
        if (num1 == num2) i = 1;
        else if (num1 != num2) i = -1;

        return i;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 3));
        System.out.println(new Solution().solution(11, 11));
        System.out.println(new Solution().solution(7, 99));
    }
}