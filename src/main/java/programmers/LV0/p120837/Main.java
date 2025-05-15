package programmers.LV0.p120837;

class Solution {
    public int solution(int hp) {

        int a = hp / 5;
        int b = (hp - (a * 5)) / 3;
        int c = ((hp - (a * 5) - (b * 3))) / 1;

        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(23));
        System.out.println(new Solution().solution(24));
        System.out.println(new Solution().solution(999));
    }
}