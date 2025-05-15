package programmers.LV0.p181936;

class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m == 0) {
            answer = 1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(60, 2, 3));
        System.out.println(new Solution().solution(55, 10, 5));
    }
}