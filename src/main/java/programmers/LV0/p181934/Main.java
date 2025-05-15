package programmers.LV0.p181934;

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals(">") && eq.equals("=")) {
            if (n >= m) answer = 1;
        } else if (ineq.equals("<") && eq.equals("=")) {
            if (n <= m) answer = 1;
        } else if (ineq.equals(">") && eq.equals("!")) {
            if (n > m) answer = 1;
        } else if (ineq.equals("<") && eq.equals("!")) {
            if (n < m) answer = 1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("<", "=", 20, 50));
        System.out.println(new Solution().solution(">", "!", 41, 78));
    }
}