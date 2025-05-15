package programmers.LV0.p120922;

class Solution {
    public int solution(int M, int N) {
        int answer = (M * N) - 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 2));
        System.out.println(new Solution().solution(2, 5));
        System.out.println(new Solution().solution(1, 1));
    }
}