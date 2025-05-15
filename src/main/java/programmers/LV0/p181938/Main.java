package programmers.LV0.p181938;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = a + "" + b;
        if (Integer.parseInt(ab) >= (2 * a * b)) answer = Integer.parseInt(ab);
        else answer = 2 * a * b;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 91));
        System.out.println(new Solution().solution(91, 2));
    }
}