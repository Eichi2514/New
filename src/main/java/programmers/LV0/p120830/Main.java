package programmers.LV0.p120830;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int h = n / 10;

        answer = (n * 12000) + ((k - h) * 2000);

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10, 3));
        System.out.println(new Solution().solution(64, 6));
    }
}