package programmers.LV0.p120820;

class Solution {
    public int solution(int age) {
        return 2023 - age;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(40));
        System.out.println(new Solution().solution(23));
    }
}